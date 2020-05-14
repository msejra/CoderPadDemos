import java.util.Arrays;

public class AnagramStringDemo {
	public static void main(String args[]) {
		String s1 = "STOP";
		String s2 = "TOPS";
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		int len1 = s1.length();
		int len2 = s2.length();
		AnagramStringDemo.findInputAnagramOrNot(s1, s2, len1, len2);

	}

	static void findInputAnagramOrNot(String s1, String s2, int len1, int len2) {
		if (len1 != len2) {
			System.out.println("String are not anagrams");
		} else {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2) == true) {
				System.out.println("Strings are anagram");
			} else {
				System.out.println("Strings are not anagram");
			}

		}
	}
}
