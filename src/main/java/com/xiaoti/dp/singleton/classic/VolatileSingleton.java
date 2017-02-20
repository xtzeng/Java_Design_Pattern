package com.xiaoti.dp.singleton.classic;

public class VolatileSingleton {
	
	private volatile static VolatileSingleton uniqueInstance;
	private int field1,field2;
	
	
	private VolatileSingleton(){
		
	}
	
	public static VolatileSingleton getInstance(){
		if(uniqueInstance==null){
			synchronized (VolatileSingleton.class) {
				if (uniqueInstance==null) {
					uniqueInstance = new VolatileSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
