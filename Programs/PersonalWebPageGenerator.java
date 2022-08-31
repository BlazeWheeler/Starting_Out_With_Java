/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Data Structures
 * by Tony Gaddis & Godfrey Muganda 
 * Page: 267 Problem 15: Personal Web Page Generator
 * 
 * @DescriptionWrite a program that asks the user for his or her name, 
 * and then asks the user to enter a sentence that 
 * describes him or herself. 
 * Here is an example of the program's screen: 
 * Enter your name: Julie Taylor (Enter)
 * Describe yourself: I am a computer science major, a member of the 
 * Jazz club, and I hope to work as a mobile app developer after I 
 * graduate. [Enter) 
 * Once the user has entered the reques2ted input, the program should
 * create an HTML file, containing the input, for a simple Web page. 
 * Here is an example of the HTML content, 
 * using the sample input previously shown: 
 * <html> 
 * <head>
 * </head>
 *  <body> 
 *  	<center> 
 *  		<h1>Julie Taylor</h1>
 *      </center> 
 *      <hr/>
 *       I an a computer science major, a member of the Jazz club, and 
 *       I hope to work as a mobile app developer after I graduate
 *       <hr/> 
 * </body>
 * </html>
 */

import java.util.*;


public class PersonalWebPageGenerator {

	public static void main(String[] args) {
		
		// Scanner 
		Scanner in = new  Scanner(System.in);
		
		    System.out.print("Enter your name: ");
		    String name=in.nextLine();
		    
		    System.out.print("Describe yourself: ");
		    String description=in.nextLine();
		    in.close();
		    
		    //Output
		    System.out.println("<html>\n<head>\n</head>\n<body>\n<center>");
	        System.out.println("\t<h1>"+name+"</h1>");
	        System.out.println("</center>\n<hr/>\n"+description+"\n<hr />\n</body>\n</html>");
		
	}

}
