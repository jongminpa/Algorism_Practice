package algo09_17;

public class Solution3 {
	public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isLowerCase(c)) {
				char shifted = (char) (((c - 'a' + n) % 26) + 'a');
				sb.append(shifted);
			} else if (Character.isUpperCase(c)) {
				char shifted = (char) (((c - 'A' + n) % 26) + 'A');
				sb.append(shifted);
			} else {
				sb.append(c);
			}
		}

		return sb.toString();
	}
}
