public class MainMethod {
	/** Main method */
	public static void main(String[] args) {
		// Create to char arrays
		char[] test = {'T', 'e', 'S', 't'};
		char[] test2 = {'T', 'e', 'S', 't', '2'};

		// Create two MyString objects
		MyString str = new MyString(test);
		MyString str2 = new MyString(test2);

		// Display character at index 1 of MyString object 1
		System.out.println("\nCharacter at index 1 of MyString object 1: " 
			+ str.charAt(1));

		// Display the length of MyString object 1
		System.out.println("\nLength of MyString object 1: " + str.length());


		// Display a Substring from index 2 to 4 of MyString object 1
		System.out.println("\nSubstring from index 2 to 4 of MyString object 1: ");
		MyString substr = str.substring(2,4);
		for (int i = 0; i < substr.length(); i++) {
			System.out.print(substr.charAt(i));		
		}
		System.out.println();

		// Display MyString object 1 as lowercase:"
		System.out.println("\nMyString object 1 to lowercase:");
		MyString lower = str.toLowerCase();
		for (int i = 0; i < lower.length(); i++) {
			System.out.print(lower.charAt(i));		
		}
		System.out.println();

		// Test if MyString object 1 is equal to MyString object 2
		System.out.println("\nMyString object 1 is equal to MyString object 2? " 
			+ str.equals(str2));

		// Display the integer 145 as a MyString object
		System.out.println("\nDisplay the integer 145 as a MyString object: ");
		MyString value = str.valueOf(145);
		for (int i = 0; i < value.length(); i++) {
			System.out.print(value.charAt(i));		
		}
		System.out.println();

	}
}