package cn.click.io;

import java.io.*;

/**
 * @author sz
 * @date 2023年02月12日 16:11
 */
public class ConversionIO {
    public static void main(String[] args) throws IOException{
        /**
         * 转换流：属于字符流
         * 作用：提供字节流与字符流之间的转换
         * InputStreamReader:将一个字节的输入流转换成字符的输入流
         * OutputStreamWriter:将一个字符的输出流转换成字节的输出流
         */
        InputStreamReader isr=new InputStreamReader(new FileInputStream("A.txt"),"utf-8") ;
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("B.txt"),"gbk");
        char[] chars = new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            osw.write(chars);
        }
        isr.close();
        osw.close();
    }
}
