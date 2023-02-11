package cn.click.RegExp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGroup {
    public static void main(String[] args) {
      Pattern p=Pattern.compile("(\\d{3,5})([a-z]{2})");
      //若要分组，要先分别对分组的类别加上小括号(\d{3,5})和([a-z]{2})
      String s="123aa-34345bb-234cc-00";
      Matcher m=p.matcher(s);
      while (m.find()){
          p(m.group(1));
          //哪个是第一组，就看引号里的左小括号，第一个出现就是第一组以此类推
          //123，34345，234为第一组
          //aa，bb为第二组
      }
    }


    public static void p(Object o)
    {
        System.out.println(o);
    }
}

