public class MyStringBuilder {
	private String s;

	public MyStringBuilder(String s) {
		this.s = s;
	}

	public MyStringBuilder append(MyStringBuilder s) {
		String newStr  = this.s; 
		newStr += s;
		return new MyStringBuilder(newStr);
	}

	public MyStringBuilder append(int i) {
		String newStr  = this.s; 
		newStr += i + "";
		return new MyStringBuilder(newStr);
	}

	public int length() {
		return s.length();
	}

	public char charAt(int index) {
		return s.charAt(index);
	}

	public MyStringBuilder toLowerCase() {
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				newStr += (char)(s.charAt(i) + 32) + "";
			}
		}
		return new MyStringBuilder(newStr);
	}

	public MyStringBuilder substring(int begin, int end) {
		String newStr = "";
		for (int i = begin; i < end; i ++) {
			newStr += s.charAt(i) + "";
		}
		return new MyStringBuilder(newStr);
	}

	public String toString() {
		return s;
	}
}