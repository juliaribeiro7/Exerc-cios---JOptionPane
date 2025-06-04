/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CalculadoraSimples {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        double num1 = Double.parseDouble(num1Str);

        String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");
        double num2 = Double.parseDouble(num2Str);

        String operacao = JOptionPane.showInputDialog("Escolha a operação (+, -, *, /):");

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida! Escolha +, -, * ou /.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }
}
