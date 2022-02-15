public class MainMethod {
	/** Main method */
	public static void main(String[] args) {
		// Create to char arrays
		char[] test = { 'T', 'e', 'S', 't' };
		char[] test2 = { 'T', 'e', 'S', 't', '2' };

		// Create two MyString objects
		MyString str = new MyString(test);
		MyString str2 = new MyString(test2);

		// MyString String Methods
		System.out.println("\n");
		System.out.println("_________MyString String Methods_________");

		// Display character at index 1 of MyString object 1
		System.out.println("\nCharacter at index 1 of MyString object 1: "
				+ str.charAt(1));

		// Display the length of MyString object 1
		System.out.println("\nLength of MyString object 1: " + str.length());

		// Display a Substring from index 2 to 4 of MyString object 1
		System.out.println("\nSubstring from index 2 to 4 of MyString object 1: ");
		MyString substr = str.substring(2, 4);
		for (int i = 0; i < substr.length(); i++) {
			System.out.print(substr.charAt(i));
		}
		System.out.print("\n");

		// Display MyString object 1 as lowercase:"
		System.out.println("\nMyString object 1 to lowercase:");
		MyString lower = str.toLowerCase();
		for (int i = 0; i < lower.length(); i++) {
			System.out.print(lower.charAt(i));
		}
		System.out.print("\n");

		// Test if MyString object 1 is equal to MyString object 2
		System.out.println("\nMyString object 1 is equal to MyString object 2? "
				+ str.equals(str2));

		// Display the integer 145 as a MyString object
		System.out.println("\nDisplay the integer 145 as a MyString object: ");
		MyString value = str.valueOf(145);
		for (int i = 0; i < value.length(); i++) {
			System.out.print(value.charAt(i));
		}

		// MyString Split Method
		System.out.println("\n");
		System.out.println("_________MyString Split Method_________");
		System.out.println("\n");

		String[] temp1 = MyString.split("I Am A StringSplitBy A Delimiter Can You Tell?", "Split");
        for (String s : temp1) {
            System.out.print(" " + s);
        }

		System.out.println("\n");

        String[] temp2 = MyString.split("I#Am#A#String#Split#By#Delimiters#Can#You#Tell?", "#");
        for (String s : temp2) {
            System.out.print(" " + s);
        }

		// MyString Builder 
		System.out.println("\n");
		System.out.println("_________MyStringBuilder Method_________");
		System.out.println("\n");

		MyStringBuilder str1 = new MyStringBuilder("TEST");

		System.out.println("\nAppend the string \" MyStringBuilder\" to string: " + 
			str1.append(new MyStringBuilder(" MyStringBuilder")));

		// Display string with the integer 101 append to it
		System.out.println("\nAppend integer 101 to the string: " + str1.append(101));

		// Display the length of str1
		System.out.println("\nLength of string: " + str1.length());

		// Display character at index 2
		System.out.println("\nCharacter at index 2: " + str1.charAt(2));

		// Display str1 as lowercase
		System.out.println("\nString to lower case: " + str1.toLowerCase());

		// Display the substring of str1 from index 1 to 3
		System.out.println("\nSubstring of string from index 1 to 3: " + 
			str1.substring(1, 3));

		// Return the string
		System.out.println("\nDisplay string: " + str1.toString());
	}
}