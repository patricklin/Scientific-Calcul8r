package com.example.patrick.calculator;

/**
 * Created by Bryan Nguyen on 3/1/2015.
 */
public class TestParser {
    public static void main(String[] args) {
        SymjaParser parser = new SymjaParser();
        String[] inputs = {"1", "2", "3", "4"};
        for (String input : inputs) {
            System.out.println(parser.toSymja(input));
        }
    }

}
