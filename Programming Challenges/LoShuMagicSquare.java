/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 494 Problem 16: Lo shu Magic square
 * 
 * @Description The Lo Shu Magic Square is a grid with 3 rows and 3 columns, shown in Figure 7-31. 
 * The Lo Shu Magic Square has the following properties:
 * The grid contains the numbers 1 through 9 exactly.
 * The sum of each row, each column, and each diagonal all add up to the same number.
 * This is shown in Figure 7-32. 
 * In a program you can simulate a magic square using a two-dimensional array.
 * Write a method that accepts a two-dimensional array as an argument,
 * and determines whether the array is a Lo Shu Magic Square. 
 * Test the function in a program.
 */

public class LoShuMagicSquare {

	public static void main(String[] args) {
		
		// Test Of A Magic Square
		int testArr[][] = { {4,9,2}, {3,5,7}, {8,1,6} };
		// Test Of Not A Magic Square
		int testArr2[][] = { {4,9,2}, {3,5,7}, {8,1,8} };
		
		// Output Conditions
		if(isMagicSquare(testArr) == true) 
			System.out.println("Is A Magic Square");
		else 
			System.out.println("Is Not A Magic Square");
		
		System.out.println();
		
		if(isMagicSquare(testArr2) == true) 
			System.out.println("Is A Magic Square");
		else 
			System.out.println("Is Not A Magic Square");	
	}
	
	/**
	 * Checks If 2D Array Is A Lo Shu Magic Square
	 * @param arr 2D Array
	 * @return isSquare returns True If 2D Array Is A Lo Shu Magic Square
	 */
	
	public static boolean isMagicSquare(int arr[][]) {
		
		// Print Square
		printSquare(arr);
		
		boolean isSquare = true;
		int total = 0, horizontal = 0;
		
		// Get Horizontal Value To Compare
		horizontal = arr[0][0] + arr[1][1] + arr[2][2];
		
		// Check Rows 
		// Row
		for(int i = 0; i < arr.length; i++) { 
			total = 0;
			// Column
			for(int j = 0; j < arr[i].length; j++) { 
				total += arr[i][j];
			}
			if(total != horizontal) { 
				isSquare = false;
				break;
			}	
		}
		// Check Columns
		// Column
		for(int i = 0; i < arr[0].length; i++) { 
			// Row
			total = 0;
			for(int j = 0; j < arr.length; j++) { 
				total += arr[j][i];
			}
			if(total != horizontal) { 
				isSquare = false;
				break;
			}
		}
		return isSquare;
	}
	
	/**
	 * Print Out Array In Lo Shu Magic Square Format
	 * @param arr 2D Array
	 */
	
	public static void printSquare(int arr[][]) { 
		System.out.println("Lo Shu Magic Square");
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) { 
			System.out.print("|");
			for(int j = 0; j < arr[i].length; j++) { 
				System.out.print( arr[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
