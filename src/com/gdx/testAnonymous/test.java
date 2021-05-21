package com.gdx.testAnonymous;

public class test {
    public static void main(String[] args) {
        Bj b1 = new Bj();
        b1.address();
        b1.price();

        Bj b2 = new Bj();
        showHouse(b2);

        Tj t2 = new Tj();
        showHouse(t2);
        //只用一次的根本无需再创建对象， 直接在这里写就好

        //匿名内部类
        /*LinkedHouse lj = new LinkedHouse() {
            @Override
            public void address() {
                System.out.println("nanjing");
            }

            @Override
            public void price() {
                System.out.println("2222222222");
            }
        };

         */
        showHouse(new LinkedHouse() {
            @Override
            public void address() {
                System.out.println("nanjing");
            }

            @Override
            public void price() {
                System.out.println("2222222");
            }
        });

        //在项目中， 如果某个类只应用一次， 那么就可以用匿名内部类， 但是在java中不那么重要
        //可能在android中多

    }
    public static void showHouse(LinkedHouse lj){
        lj.address();
        lj.price();
    }
    /*
    public static void showHouse(Tj tj){

        tj.address();
        tj.price();
    }

     */
}
