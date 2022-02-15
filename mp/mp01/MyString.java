
// Implement the MyString class
public class MyString {
	// Data Fields
	private char[] chars;

	// Constructor
	/** Create MyString object of specified characters */
	public MyString(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}

	// Methods
	/** Return the character at the specified index */
	public char charAt(int index) {
		return chars[index];
	}

	/** Return length */
	public int length() {
		return chars.length;
	}

	/** Return a substring of string with specified begin and end */
	public MyString substring(int begin, int end) {
		char[] ch = new char[end - begin];
		for (int i = begin, j = 0; i < end; i++, j++) {
		 	ch[j] = chars[i];
		}
		return new MyString(ch); 
	}

	/** Return a new MyString of all LowerCase characters */
	public MyString toLowerCase() {
		char[] ch = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z')
				ch[i] = (char)(chars[i] + 32);
			else
				ch[i] = chars[i];
		}
		return new MyString(ch);
	}

	/** Return true if the two strings are equal */
	public boolean equals(MyString s) {
		if (chars.length != s.length())
			return false;
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] != s.charAt(i))
				return false;
		}
		return true;
	}

	/** return i as a MyString object */
	public static MyString valueOf(int i) {
		// Count the number of digits in i
		int length = 0; 
		int n = i;
		while (n >= 1) {
			n /= 10;
			length++;
		}

		// Create a char array of the length of i
		char[] ch = new char[length];
		
		// Copy the digits in i to the array
		for (int j = 0, k = (int)Math.pow(10, length - 1); 
			j < length; j++, k /= 10) {
			ch[j] = Character.forDigit((i / k), 10);
			i %= k; 
		}

		return new MyString(ch);
	}
}