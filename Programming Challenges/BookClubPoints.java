/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 188 Problem 16: Book Club Points 
 * 
 * @Description Serendipity Booksellers has a book club that awards 
 * points to its customers based on the number of books purchased each
 * month. The points are awarded as follows:
 * If a customer purchases 0 books, he or she earns 0 points.
 * If a customer purchases 1 book, he or she earns 5 points.
 * If a customer purchases 2 books, he or she earns 15 points.
 * If a customer purchases 3 books, he or she earns 30 points.
 * If a customer purchases 4 or more books, he or she earns 60 points.
 * Write a program that asks the user to enter the number of books 
 * that he or she has purchased this month and then 
 * displays the number of points awarded.
 */


import java.util.*;

public class BookClubPoints {
	
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		int bookClubPoints, booksPurchased; 
		
		System.out.println("Enter Number Of Books Purchased:  ");
		booksPurchased = in.nextInt(); 
		in.close();
		
		if(booksPurchased < 1) { 
			bookClubPoints = 0; 
			System.out.println("You Have Earned " + bookClubPoints + 
								" Points");
		}
		
		if(booksPurchased == 1 && booksPurchased < 2) { 
			bookClubPoints = 5; 
			System.out.println("You Have Earned " + bookClubPoints + 
					" Points");
		}
		
		if(booksPurchased == 2 && booksPurchased < 3 ) { 
			bookClubPoints = 15; 
			System.out.println("You Have Earned " + bookClubPoints + 
					" Points");
		}
		
		if(booksPurchased == 3 && booksPurchased < 4 ) { 
			bookClubPoints = 30;
			System.out.println("You Have Earned " + bookClubPoints + 
					" Points");
		}
		
		if(booksPurchased >= 4) { 
			bookClubPoints = 60; 
			System.out.println("You Have Earned " + bookClubPoints + 
					" Points");
		}
	}
}
