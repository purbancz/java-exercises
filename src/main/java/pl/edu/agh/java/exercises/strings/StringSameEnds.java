package pl.edu.agh.java.exercises.strings;

/**
 * Given a string, return the longest substring that appears at both the
 * beginning and end of the string without overlapping. For example,
 * sameEnds("abXab") is "ab".
 * <p>
 * Dla danego ciągu znaków zwróć najdłuższy podciąg, który występuje na początku
 * i na końcu, bez nachodzenia na siebie. Przykłądowo, sameEnds("abXab") to
 * "ab".
 *
 * @see http://codingbat.com/prob/p131516
 */
public class StringSameEnds {
	public String sameEnds(String string) {
		String same = "";
		int idx = 1;
		for (int i = string.length() / 2; i < string.length(); i++) {
			if (string.charAt(i) == string.charAt(0) && i > idx) {
				idx = i;
			}
		}
		for (int i = idx; i < string.length(); i++) {
			if (string.charAt(0 + i - idx) == string.charAt(i)) {
				same += string.charAt(0 + i);
			}
		}
		return same;
	}
}
