package com.xiaoti.basic.enums.color;

public enum Color2 {
    
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    
    
   private String name ;
   private int index ;
    
   private Color2( String name , int index ){
       this.name = name ;
       this.index = index ;
   }
    
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public int getIndex() {
       return index;
   }
   public void setIndex(int index) {
       this.index = index;
   }
   
   
   /* 总结：
       枚举的本质是类，在没有枚举之前，仍然可以按照java最基本的编程手段来解决需要用到枚举的地方。
       枚举屏蔽了枚举值的类型信息，不像在用public static final定义变量必须指定类型。
       枚举是用来构建常量数据结构的模板，这个模板可扩展。
       枚举的使用增强了程序的健壮性，比如在引用一个不存在的枚举值的时候，编译器会报错。
   */
   public static void main(String[] args) {
	   
       //输出某一枚举的值
       System.out.println( Color2.RED.getName() );
       System.out.println( Color2.RED.getIndex() );

       //遍历所有的枚举
       for( Color2 color : Color2.values()){
           System.out.println( color + "  name: " + color.getName() + "  index: " + color.getIndex() );
       }
   }
    

}
