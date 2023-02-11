package cn.click.reflection;

//测试class对象类的创建方式有哪些
public class TestDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p=new Student();
        System.out.println(p);
        //方式一通过实例对象获得Class类
        Class c1 = p.getClass();
        System.out.println(c1.hashCode());
        //方式二通过forname获得
        Class c2 = Class.forName("cn.click.reflection.Student");
        System.out.println(c2.hashCode());
        //方式三通过类名获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());
        //一个加载的类在jvm中只有一个Class实例，也就是不过实例了多少了对象，相对应的Class类只有一个


        Class c4 = Teacher.class;
        System.out.println(c4.hashCode());

        //获得父类
        Class superclass = c1.getSuperclass();
        System.out.println(superclass.hashCode());

    }
}

 class Person{

    String name;
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name="学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name="老师";
    }
}


