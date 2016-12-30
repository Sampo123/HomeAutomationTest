package homeautomation.test;

import homeautomation.test.alipuketti.Ruubi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
    	
    	String asf = null;
    	try (InputStream is = System.in) {
    		try (InputStreamReader isr = new InputStreamReader(is)) {
    			try (BufferedReader br = new BufferedReader(isr)) {
    				System.out.println("Gimme something!");
    				asf = br.readLine();
    			}
    		}
    	}
    	catch (IOException ioe) {
    		throw new RuntimeException(ioe);
    	}
    	
    	System.out.println("Something you gave is: " + asf);
        	
    }
    
    private static void doSomething(int k) {
    	System.out.println(k + " run");
    }
 
}
