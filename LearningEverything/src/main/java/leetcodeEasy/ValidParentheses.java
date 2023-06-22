//https://leetcode.com/problems/valid-parentheses/description/
// Takes in string of parenthesis
// Return true if they're valid, false otherwise

package leetcodeEasy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if(!stack.empty())
                    switch(c) {
                        case ')':
                            if(stack.peek() == '(') stack.pop();
                            else return false;
                            break;
                        case ']':
                            if(stack.peek() == '[') stack.pop();
                            else return false;
                            break;
                        case '}':
                            if(stack.peek() == '{') stack.pop();
                            else return false;
                            break;
                        default:
                            break;
                    }
                else return false;
            }
        }

        if(stack.empty()) return true;
        else return false;
    }
}
