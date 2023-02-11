package cn.click.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        p(" \n\r\t".matches("\\s{4}"));  //true
        //   \\s{4}代表四个空白字符
        p(" ".matches("\\S"));  //false
        //   \\S代表非空白字符
        p("a_8".matches("\\w{3}"));  //true
        //  \\w{3}代表[a-zA-Z_0-9],a到z或者A到Z或者_或者0到9出现三次
        p("abc888&^%".matches("[a-z]{1,3}\\d+[%^&#]+")); //true
        //[a-z]{1,3}出现a-z次数一到三次。\d+，出现数字一次以上。[%^&#]+，出现这里面的一次以上
        p("\\".matches("\\\\"));   //true  \\\\字符串相当于正则表达式的\\,而正则表达式的\\相当于匹配前面的一个\
        //  第一个\\只表示一个\,因为java会转义的原因
        //  后面的四个\\\\,在正则表达式里面，匹配一个反斜线需要两个\\
        //用字符串要把这个正则表达式表现出来，每一个\都要用两个\\替代

    }


    public static void p(Object o)
    {
        System.out.println(o);
    }
}

