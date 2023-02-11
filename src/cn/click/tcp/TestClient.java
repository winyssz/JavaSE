package cn.click.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {
        try {
            Socket s1=new Socket("127.0.0.1",8888);
            InputStream is=s1.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            System.out.println(dis.readUTF());
            dis.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
