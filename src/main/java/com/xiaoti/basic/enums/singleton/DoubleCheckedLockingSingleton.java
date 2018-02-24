package com.xiaoti.basic.enums.singleton;

/*
用双检索实现单例：
下面的代码是用双检索实现单例模式的例子，
在这里getInstance()方法检查了两次来判断INSTANCE是否为null，
这就是为什么叫双检索的原因，记住双检索在java5之前是有问题的，
但是java5在内存模型中有了volatile变量之后就没问题了。
你可以访问DoubleCheckedLockingSingleTon.getInstance()来获得实例对象。
*/

public class DoubleCheckedLockingSingleton{
    private volatile DoubleCheckedLockingSingleton INSTANCE;

    private DoubleCheckedLockingSingleton(){}

    public DoubleCheckedLockingSingleton getInstance(){
        if(INSTANCE == null){
           synchronized(DoubleCheckedLockingSingleton.class){
               //double checking Singleton instance
               if(INSTANCE == null){
                   INSTANCE = new DoubleCheckedLockingSingleton();
               }
           }
        }
        return INSTANCE;
    }
}
