package CodeWars;

import java.util.HashMap;

public class Parser {
  public static int parseStringWordsToInt(String numStr) {
    String[] words = numStr.split("[ -]", 0);
    int finalResult = 0;
    int result = 0;
    HashMap<String, Integer> wordToNumber = new HashMap<>();
    wordToNumber.put("zero", 0);
    wordToNumber.put("one", 1);
    wordToNumber.put("two", 2);
    wordToNumber.put("three", 3);
    wordToNumber.put("four", 4);
    wordToNumber.put("five", 5);
    wordToNumber.put("six", 6);
    wordToNumber.put("seven", 7);
    wordToNumber.put("eight", 8);
    wordToNumber.put("nine", 9);
    wordToNumber.put("ten", 10);
    wordToNumber.put("eleven", 11);
    wordToNumber.put("twelve", 12);
    wordToNumber.put("thirteen", 13);
    wordToNumber.put("fourteen", 14);
    wordToNumber.put("fifteen", 15);
    wordToNumber.put("sixteen", 16);
    wordToNumber.put("seventeen", 17);
    wordToNumber.put("eighteen", 18);
    wordToNumber.put("nineteen", 19);
    wordToNumber.put("twenty", 20);
    wordToNumber.put("thirty", 30);
    wordToNumber.put("forty", 40);
    wordToNumber.put("fifty", 50);
    wordToNumber.put("sixty", 60);
    wordToNumber.put("seventy", 70);
    wordToNumber.put("eighty", 80);
    wordToNumber.put("ninety", 90);
    wordToNumber.put("hundred", 100);
    wordToNumber.put("thousand", 1000);
    wordToNumber.put("million", 1000000);

    for(String s : words) {
      if(!s.equals("and")) {
        System.out.println(s);
        int number = wordToNumber.get(s);

        if(number < 100) result += number;
        if(number == 100) result *= 100;
        if(number > 100) {
          result *= number;
          finalResult += result;
          result=0;
        }
      }
    }
    finalResult += result;
    return finalResult;
  }
}
