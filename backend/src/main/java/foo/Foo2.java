package foo;

/**
 * Foo2 class
 */
public class Foo2 {

    public static int div(int a, int b) {
    	if (b == 0) {
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

}
