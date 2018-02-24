package com.xiaoti.basic.enums.signal;

public class TrafficLight {  
	
    static Signal color = Signal.RED;  
    
    public static void change() {  
        switch (color) {  
        case RED:  
            color = Signal.GREEN; 
            System.out.println(color);
            break;  
        case YELLOW:  
            color = Signal.RED;  
            System.out.println(color);
            break;  
        case GREEN:  
            color = Signal.YELLOW;  
            System.out.println(color);
            break;  
        }  
    } 
    
    public static void main(String[] args) {
		change();
	}
}  
