package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String anyString, PoemDecorator poemDecorator) {
        String result =  poemDecorator.decorate(anyString);
        System.out.println(result);
    }
    public String reverseText(String anyString) {
        String rev = "";
        for(int i = anyString.length() - 1; i >= 0; i--) {
            rev = rev + anyString.charAt(i);
        }
        return rev;
    }
    public String capitalizeEveryOtherLetter(String anyString) {
        String cap = anyString;
        String output = "";
        for(int i = 0; i < cap.length(); i++) {
            if(i % 2 == 0) {
                output += Character.toUpperCase(cap.toCharArray()[i]);
            } else {
                output += Character.toLowerCase(cap.toCharArray()[i]);
            }
        }
        return output;
    }
}
