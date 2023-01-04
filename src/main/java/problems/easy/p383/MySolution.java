package problems.easy.p383;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

public class MySolution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] charArray = ransomNote.toCharArray();
        for (char magazineChar : charArray) {
            int pos = magazine.indexOf(magazineChar);
            if (pos == -1) {
                return false;
            } else {
                magazine = magazine.substring(0, pos) + magazine.substring(pos + 1);
            }
        }
        return true;
    }

    // time complexity = O(n*m)
    // space complexity = O(m)
}
