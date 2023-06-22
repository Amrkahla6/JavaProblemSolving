public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        s = s.substring(s.lastIndexOf(" ")+1);
        return s.length();
    }
}
