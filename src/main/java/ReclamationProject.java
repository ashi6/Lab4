/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * A class that was reclaimed.
 */
public class ReclamationProject {
    /**
     * Returns the longest substring match between the two inputs, ignoring the last character.
     * If you add a space at the end, it will work more or less without issue.
     *
     * @param string1 The first input
     * @param string2 The second input
     * @return The longest substring match between the two inputs, ignoring the last character
     */
    public static String longestCommonSubstring(final String string1, final String string2) {
        String shorterString = string1;
        String longerString = string2;
        if (string1.length() > string2.length()) {
            String temp = shorterString;
            shorterString = longerString;
            longerString = temp;
        }
        String longestMatch = ""; // there is no initial match
        for (int i = 0; i < shorterString.length(); i++) {
            for (int j = shorterString.length() - i; j > 0; j--) {
                for (int k = 0; k < longerString.length() - j; k++) {
                    if (shorterString.regionMatches(i, longerString, k, j) // substrings match
                            && j > longestMatch.length()) { // longer than the previous match
                        longestMatch = shorterString.substring(i, i + j); // found a longer match!
                    }
                }
            }
        }
        return longestMatch;
    }
}
