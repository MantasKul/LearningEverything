package leetcodeEasy;

import java.util.HashMap;

public class romanToInt {

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNum = new HashMap<Character, Integer>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        int answer = 0;
        char previous = s.charAt(0);
        answer += romanNum.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            System.out.println("Prev: " + previous + " Curr: " + s.charAt(i));

            if(previous == 'I' && (s.charAt(i) == 'V' || s.charAt(i) == 'X')) {
                answer -= romanNum.get(previous);
                answer += romanNum.get(s.charAt(i)) - 1;
            }
            else if(previous == 'X' && (s.charAt(i) == 'L' || s.charAt(i) == 'C')) {
                answer -= romanNum.get(previous);
                answer += romanNum.get(s.charAt(i)) - 10;
            }
            else if(previous == 'C' && (s.charAt(i) == 'D' || s.charAt(i) == 'M')) {
                answer -= romanNum.get(previous);
                answer += romanNum.get(s.charAt(i)) - 100;
            }
            else answer += romanNum.get(s.charAt(i));

            previous = s.charAt(i);
        }

        return answer;
    }
}
