package leet;

public class ZigzagConversion {

	public String convert(String str, int numRows) {
		if (numRows<=1) 
			return str;
		final char[] out = new char[str.length()];
		final int max = 2 * numRows - 2;
		int leap = max, index=0;
		for (int i = 0; i < Math.min(numRows, str.length()); i++) {  // outer for-loop
			for (int j = i; j < str.length(); j += max) {  // inner for-loop
				out[index++]=str.charAt(j);  // assignment statement
				if (leap != max && j + leap < str.length()) // if statement
					out[index++]=str.charAt(j + leap);
			}
			leap -= 2;
			if (leap < 1) 
				leap = max;
		}
		return new String(out);
	}

	public static void main(String[] args) {
		System.out.println(new ZigzagConversion()
				.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 5));
	}
}
