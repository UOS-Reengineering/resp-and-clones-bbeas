package example.project.CodeClones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        // TODO: implement this function to compute the Jaccard similarity between two string arrays
        int intersection = 0;
        for (String str1 :set1) { {
            for(String str2: set2) {
                if(str1.equals(str2)) {
                    intersection++;
                }
            }
        }}
        int union = set1.size()+set2.size()-intersection;
        return (float)intersection/(float) union;
    }
}
