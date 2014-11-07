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
        //ArrayList<Integer> letterArray = new ArrayList<Integer>();
        int[] letterCounts = new int[26];
        String letterList = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Character> letterListArray = new ArrayList<Character>();
        for (int i = 1; i <= 26; i++) {
            char c = letterList.charAt(i - 1);
            letterListArray.add(c);
        }

        //for (char cc : letterListArray)
        //    System.out.print(cc + " " );
        //System.out.println();

        for (int i = 0; i < 26; i++) {
            for (int i2 = 0; i2 < string.length(); i2++) {
                char c = string.charAt(i2);
                if (c == letterListArray.get(i)) {
                    int cIndex = (int) (c - 'a');
                    letterCounts[cIndex]++;
                }
            }
        }
        System.out.println("Your string count (by letter) is:");
        for (int i = 0; i < 26; i++) {
            System.out.println(letterListArray.get(i) + ": " + letterCounts[i]);
        }
    }

    public static void main(String args[]) {
        toNumbers("Enter yo string!");
    }

}
