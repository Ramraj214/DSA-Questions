package Strings;

public class StrCompression {
    // time complexcity O(n)
    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder("");
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(ch);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1));
        if (count > 1) {
            sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
