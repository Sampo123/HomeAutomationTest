package homeautomation.test;

import homeautomation.test.alipuketti.Ruubi;

import com.pi4j.io.gpio.GpioPinAnalogInput;
import com.pi4j.wiringpi.Gpio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        int x = 0;
//        int y = 1;
//        int z = x +y;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        //GpioPinAnalogInput input = null;
//        // input = getThisSomewhere().com
//        /*if (input != null) {
//        	// here do something
//        }*/
//        //boolean short int long float double char 
//        
//        char c = 'a';
//        byte b = 0;
//        byte[] byteArrAY =null;
//        
//        Gpio.
        
//        String s = "sampo";
//        String o = "sampo";
//        
//        
//        if(s.equals(o)) {
//        	
//        }
//        
//        if(s == o) {
//        	System.out.println("s equals o");
//        }
//        
//        if(s != o) {
//        	System.out.println("s is not equal to o");
//        }
    	
    	for (int i = 4; i < 16; i++) {
    		Mutteri m = new Mutteri(i);
    		m.printMyName();
    	}
    	
    	Ruubi r = new Ruubi();
        	
    }
    
    private static void doSomething(int k) {
    	System.out.println(k + " run");
    }
 
}
