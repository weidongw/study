package com.wwd.object;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 13:39.
 *
 * 通过对象直接访问成员变量，会存在数据安全性问题
 * 这个时候，我们就想能不能不让外界的对象直接访问成员变量呢？
 * 能。
 *
 * 如何实现？
 *      private关键字
 *
 * private：
 *      是一个修饰符
 *      可以修饰成员变量，也可以修饰成员方法
 *      被Private修饰的成员只能在本类中被访问
 *
 * 针对private修饰的成员变量，我们会相应的提供getXXX()和setXxx()用于获取和设置成员变量的值，方法用public修饰
 *
 * this：代表所在类的对象引用
 *      方法被哪个对象调用，this就代表那个对象
 * 使用场景：
 *      局部变量隐藏成员变量
 *
 *
 * 构造方法：
 *      给对象的数据进行初始化
 *
 * 格式：
 *      方法名与类名相同
 *      没有返回值类型，void也不能有
 *      用public修饰
 *      没有具体的返回值
 *
 * 构造方法注意事项：
 *      A:如果我们没有给出构造方法，系统将会提供一个默认的无参构造方法。
 *      B:如果给出了构造方法，系统将不再提供默认的无参构造方法
 *          推荐：自己给无参构造器
 *      C:构造方法也是可以重载的
 *
 * 成员变量赋值：
 *      A:setXxx()方法
 *      B:带参构造方法
 */
public class MyPrivate {

//    String name;
//    int age;
    private String name;
    private int age;

    public void show() {
        System.out.println("姓名：" + name + ",年龄：" + age);
    }

    public int getAge () {
        return this.age;
    }

    public void setAge (int age) {
        if (age < 0 || age > 200) {
            System.out.println("你给的年龄有误！");
        } else {
            this.age = age;
        }
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public MyPrivate () {

    }
}
