package com.wwd.object;

/**
 * @author WangWD.
 * @date 2019/3/29.
 * @time 10:02.
 *
 * 面向对象思想：
 *      面向对象是基于面向过程的编程思想。
 *
 *      面向过程：强调的是每一个功能的步骤
 *      面向对象：强调的是对象，然后由对象去调用的功能
 *
 * 面向对象的思想特点：
 *      A:是一种更符合我们思考习惯的思想
 *      B:可以将复杂的事情简单化
 *      C:将我们从执行者变成了指挥者
 *
 * 举例：
 *      买电脑：
 *          面向过程：我要买电脑-->我要明确买电脑的意义-->上网查对应的参数信息-->去中关村买电脑-->讨价还价-->买回电脑
 *          面向对象：我要买电脑-->班长去给我买电脑-->买回电脑
 *
 * 我们学习编程语言，其实就是为了把现实世界的事物模拟出来，实现信息化
 *
 * 我们是如何表示现实世界的事物的呢？
 *      A:属性    就是事物的描述信息
 *      B:行为    就是事物能够做什么
 *      举例：学生
 *
 * Java语言最基本的单位是类，所以，我们在后面的学习过程中，是通过类来体现显示世界事物的。
 *
 * 类：是一组相关的属性和行为的集合
 * 对象：就是该事物的具体表现
 *      举例：
 *          类       学生
 *          对象     班长
 *
 * 成员变量：
 *      位置：类中，方法外
 *      初始化值：不需要给初始化值
 *
 * 成员方法：
 *      去掉 static 关键字
 *
 */
public class Demo {
    public static void main(String[] args) {

        Student student = new Student();    //new出来的对象在堆内存里面 student变量存在栈中 它的值是堆内存的地址
        System.out.println("student:" + student);   //com.wwd.object.Student@4554617c
        System.out.println(student.name);   //字符串是一个引用类型，因此默认值是null
        System.out.println(student.age);    //0

        student.age = 23;
        student.name = "wwd";
        System.out.println(student.name);
        System.out.println(student.age);

        student.study();
        student.eat();

    }

}
