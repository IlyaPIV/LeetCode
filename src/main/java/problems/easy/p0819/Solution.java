package problems.easy.p0819;

//Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.
//
//        The words in paragraph are case-insensitive and the answer should be returned in lowercase.
//
//
//
//        Example 1:
//
//        Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
//        Output: "ball"
//        Explanation:
//        "hit" occurs 3 times, but it is a banned word.
//        "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
//        Note that words in the paragraph are not case sensitive,
//        that punctuation is ignored (even if adjacent to words, such as "ball,"),
//        and that "hit" isn't the answer even though it occurs more because it is banned.
//        Example 2:
//
//        Input: paragraph = "a.", banned = []
//        Output: "a"
//
//
//        Constraints:
//
//        1 <= paragraph.length <= 1000
//        paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
//        0 <= banned.length <= 100
//        1 <= banned[i].length <= 10
//        banned[i] consists of only lowercase English letters.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        for (String s : banned) {
            String word = s.toLowerCase();
            paragraph = paragraph.replaceAll(word, "");
        }

//        paragraph = paragraph.replaceAll("\\W+", " ");

        String[] words = paragraph.split("\\W+");

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        int maxVal = 0;
        String maxWord = "";
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> pair:
             entrySet) {
            if (pair.getValue() > maxVal) {
                maxWord = pair.getKey();
                maxVal = pair.getValue();
            }
        }

        return maxWord;
    }

    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = new String[]{"a"};
        System.out.println("output: " + mostCommonWord(paragraph, banned));
    }
}
