package cn.click.tcp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 实现客户端发送文件到服务端，服务端保存文件到本地
 * 可以暂时将这里的客户端和服务端看成代码或者内存，本地到服务端，需要输入流读，客户端到服务端需要输出流写
 * 服务端需要输入流读，需要输出流写到本地
 * @author songz
 * @date 2023年02月13日 9:47
 */
public class tcpTest {
    @Test
    public void Client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
        FileInputStream fis=new FileInputStream("A.txt");
        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len=fis.read(bytes))!=-1){
             outputStream.write(bytes,0,len);
        }
        outputStream.close();
        fis.close();
        socket.close();
    }

    @Test
    public void Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("B.txt");
        byte[] bytes = new byte[1024];
        int len;
        while ((len=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }

}
