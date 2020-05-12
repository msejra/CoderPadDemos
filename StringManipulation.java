public class StringManipulation {
	public static void main(String[] args) {
		String str = "aabccd";
		char charArray[] = str.toCharArray();
		int freq[] = new int[str.length()];
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (charArray[i] == charArray[j]) {
					freq[i]++;
					charArray[j] = '0';
				}
			}

		}
		// printing
		for (int i = 0; i < freq.length; i++) {
			if (charArray[i] != '0' && charArray[i] != ' ') {
				System.out.println(charArray[i] + "-" + freq[i]);
			}

		}

	}
}
