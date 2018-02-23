package com.xiaoti.dp.strategy;

public class Context {  
	   
    private Strategy strategy;  
     
    public Double calRecharge(Double charge, Integer type) {  
       strategy = StrategyFactory.getInstance().creator(type);  
       return strategy.calRecharge(charge, RechargeTypeEnum.valueOf(type));  
    }  
   
    public Strategy getStrategy() {  
       return strategy;  
    }  
   
    public void setStrategy(Strategy strategy) {  
       this.strategy = strategy;  
    }  
     
}
