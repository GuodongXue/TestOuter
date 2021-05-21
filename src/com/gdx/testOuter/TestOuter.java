package com.gdx.testOuter;

import javax.xml.namespace.QName;

public class TestOuter {
    //属性， 方法， 构造器， 代码块， 内部类
    private int age;
    int a = 10;
    public void eat(){
        System.out.println("这是普通块");

        //外部类访问内部类的属性  ---不行
        //System.out.println(name);
        //非要访问内部类， 那么就要创建内部类的对象来进行访问
        testInner t = new testInner();
        System.out.println(t.name);
    }
    public TestOuter(){

    }
    {
        System.out.println("这是构造快");
    }
    static {
        System.out.println("这是静态块");
    }
    //成员内部类
    //静态内部类
    //方法内部类
    //匿名内部类





    //成员内部类
    //外部类的权限修饰符可以有public， default，
    //内部类的修饰符可以是public， private， default， protected
    public class testInner{
        String name;
        int a = 20;
        public void sleep(){
            int a =30;
            System.out.println(age);
            //内部类可以访问外部类的属性

            //30
            System.out.println(a);

            //20
            System.out.println(this.a);

            //10
            System.out.println(TestOuter.this.a);
        }
    }

    public static void main(String[] args) {
        TestOuter to = new TestOuter();
        //main方法里不能创建内部类对象， 有另外一种方法

        //testInner t = new testInner();
        testInner ti = to.new testInner();
        //20


    }

    //内部类的作用
    //创建比private海小的权限
    //实现java多继承

}
