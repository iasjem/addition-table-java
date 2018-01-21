/**
 * A simple program that demonstrates how Addition Table works. What is a
 * Addition Table?: http://www.math.com/tables/general/addtable.htm
 * 
 */

public class MainSrc {

	public static void main(String[] args) {
		// x = row and y = column. z = sum of x & y
		// same concept with Multiplication Table
		int x, y, z = 0;
		for (y = 0; y <= 10; y++) {
			for (x = 0; x <= 10; x++) {
				z = x + y;
				// e.g. 1 + 1 = 2
				System.out.print(z + "\t");
			}
			System.out.print("\n");
		}
	}
	// Hope you like it! :)
}
