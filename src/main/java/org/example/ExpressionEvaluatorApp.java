package org.example.ExpressionEvaluator;

import java.util.*;
public class ExpressionEvaluatorApp {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();

        Map<String, Double> variables = new HashMap<>();

        try {
            double result = evaluateExpression(expression, variables);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

  private static double evaluateExpression(String expression, Map<String, Double> variables) {
        List<String> tokens = Tokenizer.tokenize(expression);
        Queue<String> postfixExpression = InfixToPostfixConverter.infixToPostfix(tokens);

        return evaluatePostfix(postfixExpression, variables);
    }

        return operandStack.pop();
    }
}
