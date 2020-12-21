package com.sai.challenge;


import java.util.Stack;

public class ValidParenthesis {


    public static void main(String[] args) {
        System.out.println(findValidParenthesis("{[]}"));
    }

    private static boolean findValidParenthesis(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            switch (c) {
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                default:
                    stack.push(c);
            }

        }

        return stack.isEmpty();
    }
}
