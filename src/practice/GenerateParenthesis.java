package practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        backtrack(n, 0 , 0, result, new StringBuilder());
        
        return result;
    }
    
    private void backtrack(int n, int open, int close, List<String> result, StringBuilder str) {
        if (open == n && close == n) {
            result.add(str.toString());
            return;
        }
        
        if (open < n) {
            str.append('(');
            backtrack(n, open + 1, close, result, str);
            str.deleteCharAt(str.length() - 1);
        }
        
        if (close < open) {
            str.append(')');
            backtrack(n, open, close + 1, result, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
