public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.lengthOfLastWord("Hello World"));
        System.out.println(hello.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(hello.lengthOfLastWord(""));
    }
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}
