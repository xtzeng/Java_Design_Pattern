package com.xiaoti.dp.strategy;

public class EBankStrategy implements Strategy{  
	   
    @Override  
    public Double calRecharge(Double charge, RechargeTypeEnum type) {  
       return charge*0.85;  
    }  
   
}
