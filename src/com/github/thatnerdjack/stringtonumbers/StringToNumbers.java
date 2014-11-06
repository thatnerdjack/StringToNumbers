package com.github.thatnerdjack.stringtonumbers;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by block7 on 11/6/14.
 */
public class StringToNumbers {

    public static String readLine(String prompt) {
        String line = null;
        Console c = System.console();
        if (c != null) {
            line = c.readLine(prompt);
        } else {
            System.out.println(prompt);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                //Ignore
            }
        }
        return line;
    }

    public static void toNumbers(String prompt) {
        String string = readLine(prompt);
        string.toLowerCase();
        ArrayList<Integer> letterArray = new ArrayList<Integer>();
        ArrayList<Character> letterListArray = new ArrayList<Character>();
        letterArray.add('a', 0); letterArray.add('b', 1); letterArray.add('c', 2); letterArray.add('d', 3); letterArray.add('e', 4); letterArray.add('f', 5); letterArray.add('g', 6); letterArray.add('h', 7); letterArray.add('i', 8); letterArray.add('j', 9); letterArray.add('k', 10); letterArray.add('l', 11);letterArray.add('m', 12); letterArray.add('n', 13);  letterArray.add('o', 14); letterArray.add('p', 15); letterArray.add('q', 16); letterArray.add('r', 17); letterArray.add('s', 18); letterArray.add('t', 19); letterArray.add('u', 20); letterArray.add('v', 21); letterArray.add('w', 22); letterArray.add('x', 23); letterArray.add('y', 24); letterArray.add('z', 25);
        for (int i = 0; i == 25; i++) {
            for (int i2 = 0; i2 == string.length(); i2++) {
                char c = string.charAt(i2);
                if (c == letterListArray.get(i)) {
                    letterArray.add(i);
                }
            }
        }
        String printString = "";
        for (int i = 0; i == 25; i++) {
            int tempLetterCount = letterArray.get(i);
            printString += tempLetterCount + " ";
        }
        System.out.println("Your string count (by letter) is " + printString);
    }

    public static void main(String args[]) {
        toNumbers("Enter yo string damnit!");
    }

}
