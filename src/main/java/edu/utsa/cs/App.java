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
		return base + value;
	}

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
