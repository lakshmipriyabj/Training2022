package com.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Book java = new Book("java", 1000);
        System.out.println("Book Name:"+java.getName());
        System.out.println("Price:"+java.getPrice());
        System.out.println(java);
    }
}
