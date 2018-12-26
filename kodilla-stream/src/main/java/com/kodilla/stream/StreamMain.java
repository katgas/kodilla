package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Sample text number one", String::toLowerCase);
        poemBeautifier.beautify("Sample text number two", String::toUpperCase);
        poemBeautifier.beautify("Sample text number three", anyString -> "This is: " + anyString + " and something extra");
        poemBeautifier.beautify("Sample text number four", anyString -> anyString.concat(" and another concatenation"));
        poemBeautifier.beautify("Sample text number five", anyString -> anyString.replace("e", "EEE"));
        poemBeautifier.beautify("Sample text number six", anyString -> anyString.substring(0,11));
        poemBeautifier.beautify("Sample text number seven", anyString -> poemBeautifier.reverseText(anyString));
        poemBeautifier.beautify("Sample text number eight", anyString -> anyString.replace("", "  ").trim());
        poemBeautifier.beautify("Sample text number nine", anyString -> poemBeautifier.capitalizeEveryOtherLetter(anyString));


        System.out.println("\n\nOther tasks...");

        //Sample task 1

        Processor processor = new Processor();
        //one way
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        //the other way without creating the variable 'codeToExecute'
        processor.execute( () -> System.out.println("This is en example text."));

        //Sample task 2

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas.");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references.");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
