package com.xiaoti.dp.strategy;

public class CardStrategy implements Strategy{  
	   
    @Override  
    public Double calRecharge(Double charge, RechargeTypeEnum type) {  
       return charge+charge*0.01;  
    }  
   
} 
