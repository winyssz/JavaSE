package cn.click.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        try {
            ServerSocket s=new ServerSocket(8888);
            while (true)
            {
                Socket s1=s.accept();
                OutputStream os=s1.getOutputStream();
                DataOutputStream dos=new DataOutputStream(os);
                dos.writeUTF("Hello"+s1.getInetAddress()+"port-"+s1.getPort());
                dos.close();
                os.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
