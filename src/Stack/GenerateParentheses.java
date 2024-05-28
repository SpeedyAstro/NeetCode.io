package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis(n,0,0,"");
    }

    private List<String> generateParenthesis(int n, int i, int i1, String s) {
        List<String> res = new ArrayList<>();
        if (s.length()==2*n){
            res.add(s);
            return res;
        }
        if (i<n){
            res.addAll(generateParenthesis(n,i+1,i1,s+"("));
        }
        if (i1<i){
            res.addAll(generateParenthesis(n,i,i1+1,s+")"));
        }
        return res;
    }

}
