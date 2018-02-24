package com.xiaoti.basic.enums.testequals;

public class TestEquals {

	
	/*
	 * Java枚举会被编译成一个包含私有构造参数和一堆静态方法的类
	 一般在Java代码里面，涉及到比较2个值的问题，除了是简单的一般数据类型意外，
	字符串除外，我们都是使用==来判断是否相等的，
	但是对于字符串和对象以及封装类型的数据都是使用equals方法，来判断2个值是否相等。
	所以，当我看到别人的代码中，枚举类型变量，直接使用==，来判断是不是相等
	在枚举比较上使用 == ， 因为： 1. 能正常工作 2. 更快 3. 运行时是安全的 4. 编译期也是安全的
	*/
	public static void main(String[] args) {
		String ss = "BIG";
		GameEnum s1 = GameEnum.BIG;  
	    GameEnum s2 = GameEnum.BIG;  
	    GameEnum ss1 = GameEnum.SMALL;  
	    
	    System.out.println("ss == s1：" + (s1.toString() == ss)); 
	    
	    System.out.println("s1 == s2：" + (s1 == s2));  
	    System.out.println("s1.equals(s2)：" + (s1.equals(s2)));  
	  
	    System.out.println("s1 == ss1：" + (s1 == ss1));  
	    System.out.println("s1.equals(ss1)：" + (s1.equals(ss1)));  
	}
}
