package interpreter;

public class Main {



    public static void main(String[] args) {
        String data1 = "Hello";
        String data2 = "Anna";
        Expression terminalExpression1 = new TerminalExpression(data1);
        Expression terminalExpression2 = new TerminalExpression(data2);
        Expression andExpression = new AndExpression(terminalExpression1, terminalExpression2);
        Expression orExpression = new OrExpression(terminalExpression1, terminalExpression2);

        System.out.println(andExpression.interpret("Hello, world!"));
        System.out.println(orExpression.interpret("Hello, world!"));
    }
}

