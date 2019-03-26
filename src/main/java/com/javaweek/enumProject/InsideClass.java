package com.javaweek.enumProject;
// enum declaration inside a class. 
public class InsideClass 
{ 
    
    
    
//  All enums implicitly extend java.lang.Enum class.
//    toString() method is overridden in java.lang.Enum class,which returns enum constant name.
    
	enum Color 
	{ 
		RED, GREEN, BLUE; 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		Color c1 = Color.RED; 
		System.out.println(c1); 
	} 
}
