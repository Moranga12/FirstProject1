package Dudipack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static boolean palin(String a) {
        boolean answer;
        //create list of char from string a
        List<Character> pol = new ArrayList<Character>();
        String New = "";
        for (int i = 0; i < a.length(); i++) {
            pol.add(a.charAt(i));
        }
        int y = pol.size();
        //read string a from end to start
        for (int i = y - 1; i > -1; i--) {
            New += pol.get(i);
        }
        if (a.equals(New)) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
        return answer;

    }

    public static void main(String[] args) {
    Palindrome.PalindromTask("abba");}
    public static boolean PalindromTask(String a) {
        boolean answer;
        String New = "";
        for (int i = a.length()-1; i > -1; i--) {
            New += a.charAt(i);
        }
        if (a.equals(New)) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}
