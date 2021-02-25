package designPatterns.behavioral.interpreterExample;

import designPatterns.DesignPatternExample;

public class InterpreterExample extends DesignPatternExample {
    @Override
    protected void run() {
        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lions Tigers";
//        String context = "Lions Bears";
//        String context = "Tigers Bears";

        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));

        System.out.println("\n\n\nHere we are using the Interpreter pattern to Interpret strings.");
        System.out.println("The objects don't have to be strings, they could be any object/grammar");
        System.out.println("We use custom Expressions that we made to interpret the strings.");
        System.out.println("Experiment with the 'context' string to see what passes the 'rules' set out in 'buildInterpreterTree'");
    }


    static Expression buildInterpreterTree() {
        Expression singleExpression1 = new TerminalExpression("Lions");
        Expression singleExpression2 = new TerminalExpression("Tigers");
        Expression singleExpression3 = new TerminalExpression("Bears");

        //Tigers and Bears
        Expression combinedExpression1 = new AndExpression(singleExpression2, singleExpression3);

        //Lions or (Tigers and Bears)
        Expression combinedExpression2 = new OrExpression(singleExpression1, combinedExpression1);

        ///(Lions or (Tigers and Bears)) AND Bears
        return new AndExpression(singleExpression3, combinedExpression2);
    }
}
