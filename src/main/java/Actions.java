public class Actions {
    public static String DeleteExtraSpaces(String str) {
        str = str.trim();
        StringBuilder sb = new StringBuilder(str);
        boolean space = true;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                if (space) {
                    sb.deleteCharAt(i);
                    i--;
                } else {
                    space = true;
                }
            } else {
                space = false;
            }
        }
        str = sb.toString();
        return str;
    }
}
