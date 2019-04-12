package com.wwd.object;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 13:38.
 */
public class PrivateTest {

    public static void main(String[] args) {
        MyPrivate myPrivate = new MyPrivate();
        myPrivate.show();
        myPrivate.setName("王伟东");
//        myPrivate.age = 23;
        myPrivate.setAge(-24);

        myPrivate.show();
    }

}