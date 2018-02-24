package com.xiaoti.basic.enums.color;


public class ColorClient {

	
	public static void main(String[] args) {
		 
		 
		System.out.println();
        System.out.println( isRed( Color.BLANK ) ) ;  //结果： false
        System.out.println( isRed( Color.RED ) ) ;    //结果： true
 
    }
 
 
    static boolean isRed( Color color ){
        if ( Color.RED.equals( color )) {
            return true ;
        }
        return false ;
    }
}
