package cn.click.io;
import  java.io.*;
public class TestBufferStream {
    /**
     * BufferedWriter和BufferedReader是套在FileWriter和FileReader外面的处理流，使读写效率更快
     * BufferedWriter和BufferedReader用char数组接收，因为是字符流
     * BufferedInputStream和BufferedOutputStream用byte数组接收，因为是字节流
     * @param args
     * @return void
     * @date 2023/2/12 15:40
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("E:\\A.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\B.txt"));
        int len;
        char[] chars=new char[1024];
        while ((len=br.read(chars))!=-1){
            bw.write(chars,0,len);
        }
        br.close();
        bw.close();
    }
}
