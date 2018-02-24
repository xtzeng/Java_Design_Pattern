package com.xiaoti.basic.enums.singleton;


/*你可以调用Singleton.getInstance()方法来获得实例对象。
上面的两种方式就是懒汉式和恶汉式单利的创建，
但是无论哪一种，都不如枚举来的方便。
而且传统的单例模式的另外一个问题是一旦你实现了serializable接口，他们就不再是单例的了。
但是枚举类的父类【Enum类】实现了Serializable接口，
也就是说，所有的枚举类都是可以实现序列化的，这也是一个优点。
*/
public class Singleton{
	
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        return INSTANCE;
    }
}
