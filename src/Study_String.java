
public class Study_String {

	public static void main(String[] args) {
		/*The string class doesn't need to be imported, 
		since string is a primitive class in java*/
		String word = "diamond";
		String word2 = "Pearl";
		//Examplifying some methods:
		
		/*The equals method verifies if two strings have the same value (Case sensitive).
		 * It returns true or false */
		if(word.equals(word2)) {
			System.out.println("The strings are equals.");
		}
		else {
			System.out.println("The strings are different.");
		}
		
		/*The equalsIgnoreCase method does the same as the equals one,
		 but it's not case sensitive*/
		if(word.equalsIgnoreCase("DIAMOND")) {
			System.out.println("They are equals.");
		}
		else {
			System.out.println("They're different.");
		}
		
		/*The indexOf method returns the index of the first appearance 
		 of a charactere in a String.
		 (Positions counting starts at 0)*/
		System.out.println(word.indexOf("d"));
		//If the charactere doesn't appear in the string, the method returns -1
		System.out.println(word2.indexOf("j"));
		/*It can also be used to find a string within a string,
		 it will return the position of the first charactere 
		 of the string that's being searched  */
		System.out.println(word2.indexOf("ear"));
		
		//The lengh method returns the size of a string
		System.out.println(word.length());
		
		//The charAt method returns the charactere contained in the informed position
		System.out.println(word.charAt(5));
		
		//The  toLowerCase method returns the string in lower case
		System.out.println(word2.toLowerCase());
		
		//The toUpperCase method returns the string in upper case
		System.out.println(word.toUpperCase());
		
		//The replace method replaces a charactere of the string for another
		System.out.println(word2.replace("l", "a"));
		
		//The concat method joins two string as one
		System.out.println("Poke".concat("mon"));
			

	}

}
