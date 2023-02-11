package cn.click.io;
import  java.io.*;
public class TestBufferStream {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\A.txt"));
        BufferedReader br=new BufferedReader(new FileReader("D:\\A.txt"));
        int i=0;
        String s=null;
        for (i=0;i<10;i++)
        {
            s=String.valueOf(Math.random());
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
        bw.close();
    }
}
