package ToolsQA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String hel = hello("World!");   
        System.out.println(hel);
    }
    
    public static String hello() {
        return "Hello World!";
    }
    
    public static String hello(String name) {
        return name;
    }
}