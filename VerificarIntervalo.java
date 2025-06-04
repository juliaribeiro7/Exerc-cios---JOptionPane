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
public class VerificarIntervalo {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        if (num >= 10 & num <= 20) {
            JOptionPane.showMessageDialog(null, "O número " + num + " está dentro do intervalo de 10 a 20.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + num + " está fora do intervalo de 10 a 20.");
        }
    }
}
