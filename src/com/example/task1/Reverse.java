package com.example.task1;

import java.util.Iterator;
import java.util.Stack;

public class Reverse {

    // using recursion
    public static String inverse1(String str) {
        if (str.length() > 0)
            return str.charAt(str.length()-1) + inverse1(str.substring(0, str.length()-1));
        return "";
    }

    // using stack and iterator
    public static String inverse2(String str) {
        Stack<Character> stack = new Stack<Character>();
        String str2 = new String();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            str2 += stack.pop();
        }

        return str2;
    }

    // using char array
    public static String inverse3(String str) {
        char[] ch = str.toCharArray();
        String str2 = new String();
        for (int i = str.length()-1; i >= 0; i--) {
            str2 += ch[i];
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(inverse1("Hello, World!"));
        System.out.println(inverse2("Hello, World!"));
        System.out.println(inverse3("Hello, World!"));
    }

}
