package ArrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        List<Character> list = new ArrayList<>();
        if(s.length()!=t.length()) return false;
        for (int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        for (int i=0; i < t.length() ; i++){
            if(list.contains(t.charAt(i))){
                list.remove((Character)t.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram1(String s, String t) {
        return Arrays.equals(s.chars().sorted().toArray(),t.chars().sorted().toArray());
    }

    public boolean isAnagram3(String s, String t) {
        int[] bucket = new int[26];
        for (int i : s.toCharArray()){
            bucket[i-'a']++;
        }
        for (int i : t.toCharArray()){
            bucket[i-'a']--;
        }
        for (int i : bucket){
            if(i!=0) return false;
        }
        return true;
    }
}
