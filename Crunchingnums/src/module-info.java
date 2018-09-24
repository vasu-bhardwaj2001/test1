/**
 * 
 */
/**
 * @author vabha
 *
 */
	public class Operators {
	    public static void main(String[] args) {
	        int a = 1;
	        int b = a + 3;
	        int c = b - 7;
	        int d = c * 9 * -1;
	        int e = d / 3;
	        int f = e % 4;

	        System.out.println(a);                      // expected:
	        System.out.println(b);                      // expected:
	        System.out.println(c);                      // expected:
	        System.out.println(d);                      // expected:
	        System.out.println(e);                      // expected:
	        System.out.println(f);                      // expected:

	        int g = 50 / 100;
	        double h = 50 / 100;
	        double i = (double) 50 / 100;
	        double j = (double) (50 / 100);

	        System.out.println(g);                      // expected:
	        System.out.println(h);                      // expected:
	        System.out.println(i);                      // expected:
	        System.out.println(j);                      // expected:

	        System.out.println();
	        System.out.println(1 + 1);                  // expected:
	        System.out.println("1 + 1");                // expected:
	        System.out.println("1 + 1 = " + 1 + 1);     // expected:
	        System.out.println("1 + 1 = " + (1 + 1));   // expected:
	    }
	}