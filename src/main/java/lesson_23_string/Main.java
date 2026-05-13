package lesson_23_string;

public class Main {

    void main() {
        System.out.println("Length of last word:");
        System.out.println("\"Hello World\" -> " + lengthOfLastWord("Hello World"));
        System.out.println("\"   fly me   to   the moon  \" -> " + lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println();

        System.out.println("Valid palindrome:");
        System.out.println("\"A man, a plan, a canal: Panama\" -> " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("\"race a car\" -> " + isPalindrome("race a car"));
        System.out.println();

        String[] words1 = {"flower", "flow", "flight"};
        String[] words2 = {"dog", "racecar", "car"};

        System.out.println("Longest common prefix:");
        System.out.println("{flower, flow, flight} -> " + longestCommonPrefix(words1));
        System.out.println("{dog, racecar, car} -> " + longestCommonPrefix(words2));
    }

    public static int lengthOfLastWord(String text) {
        int length = 0;
        int index = text.length() - 1;

        while (index >= 0 && text.charAt(index) == ' ') {
            index--;
        }

        while (index >= 0 && text.charAt(index) != ' ') {
            length++;
            index--;
        }

        return length;
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(text.charAt(left));
            char rightChar = Character.toLowerCase(text.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static String longestCommonPrefix(String[] words) {
        if (words.length == 0) {
            return "";
        }

        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            while (!words[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
