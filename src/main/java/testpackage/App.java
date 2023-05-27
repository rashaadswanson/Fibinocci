package testpackage;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Function to generate Fibonacci Series
     * @param args
     */
	public static void main( String[] args )
    {
        int n = 10;
        System.out.println("Fibonacci Series ");
        for(int i=0;i<n;i++) {
        	System.out.println(generateFibonnacci(i));
        }
    }
    public static int generateFibonnacci(int k) {
    	if(k<=1) {
    		return k;
    	}
    		else {
    			return generateFibonnacci(k-1) + generateFibonnacci(k-2);
    		}
    	}
    }

