/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CalculadoraIMC {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog("Digite o seu peso (kg):");
        double peso = Double.parseDouble(pesoStr);

        String alturaStr = JOptionPane.showInputDialog("Digite a sua altura (m):");
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc));
    }
}
