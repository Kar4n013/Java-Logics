package q4;

//Reversing the order of words in a sentence
public class Reversing_order_of_words {

	public static String nString(String s1, int n1, int n2) {
		char[] str = new char[n2 - n1];
		for (int i = 0; i < n2 - n1; i++) {
			str[i] = s1.charAt(n1 + i);
		}

		return new String(str);

	}

	public static void main(String[] args) {
		String sentence = "Reversing the order of words in a sentence";
		int len = sentence.length(), limit = 0;
		String new_sentence = "";
		int i = 0, j = 0;

		for (int j2 = 0; j2 < sentence.length(); j2++) {
			
			if (sentence.charAt(j2) == ' ') {
				new_sentence = nString(sentence, j, j2) + " " + new_sentence;
				j = j2 + 1;
			}
			if (j2 == sentence.length()-1) {
				new_sentence = nString(sentence, j-1, j2+1) + " " + new_sentence;
			}

		}

		System.out.println("Before Operations: " + sentence);
		System.out.println("After Operations: " + new_sentence);
	}
}
