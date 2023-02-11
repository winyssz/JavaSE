package cn.click.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {
        FileInputStream in=null;
        FileOutputStream out=null;
        int b=0;
        try {
            in=new FileInputStream("D:\\A.txt");
            out=new FileOutputStream("D:\\B.txt");
            while ((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("文件已复制");
    }
}
