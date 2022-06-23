/*
Given a string of digits, you should
 replace any digit below 5 with '0'
and any digit 5 and above with '1'.
Return the resulting string.
 */

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            if (Integer.parseInt(numberString.charAt(i) + "") < 5) {
                sb.append(0);
            } else {
                sb.append(1);
            }
        }
        return sb.toString();
    }
}