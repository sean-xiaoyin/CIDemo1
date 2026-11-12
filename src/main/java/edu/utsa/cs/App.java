package edu.utsa.cs;

/**
 * Hello world!
 *
 */
public class App 
{
	int base;

	public App(int base){
		this.base = base;
	}
	
	public int add(int value){
		if (value > 0){
			return base + value；
		}else{
			return -1;
		}
	}


}
