package com.xiaoti.dp.strategy;

public class IfElseExample {  
	   
    
    public Double calRecharge(Double charge ,RechargeTypeEnum type ){  
        
       if(type.equals(RechargeTypeEnum.E_BANK)){  
           return charge*0.85;  
       }else if(type.equals(RechargeTypeEnum.BUSI_ACCOUNTS)){  
           return charge*0.90;  
       }else if(type.equals(RechargeTypeEnum.MOBILE)){  
           return charge;  
       }else if(type.equals(RechargeTypeEnum.CARD_RECHARGE)){  
           return charge+charge*0.01;  
       }else{  
           return null;  
       }  
   
    }  
     
}  
