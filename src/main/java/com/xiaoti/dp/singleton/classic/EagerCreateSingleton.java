package com.xiaoti.dp.singleton.classic;

public class EagerCreateSingleton {

	private static EagerCreateSingleton uniqueInstance = new EagerCreateSingleton();
	
	private EagerCreateSingleton(){
		
	}
	
	public static EagerCreateSingleton getInstance(){
		return uniqueInstance;
	}
}
