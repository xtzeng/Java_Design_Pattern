package com.xiaoti.dp.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {  
	   
    private static StrategyFactory factory = new StrategyFactory(); 
    
    private StrategyFactory(){  
    }  
    
    private static Map strategyMap = new HashMap<Object,Object>();  
    
    static{  
       strategyMap.put(RechargeTypeEnum.E_BANK.value(), new EBankStrategy());  
       strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.value(), new BusiAcctStrategy());  
       strategyMap.put(RechargeTypeEnum.MOBILE.value(), new MobileStrategy());  
       strategyMap.put(RechargeTypeEnum.CARD_RECHARGE.value(), new CardStrategy());  
    }  
    
    public Strategy creator(Integer type){  
       return (Strategy) strategyMap.get(type);  
    }  
    
    public static StrategyFactory getInstance(){  
       return factory;  
    }  
}
