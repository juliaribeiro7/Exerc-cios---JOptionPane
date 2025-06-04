/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercíciosjootionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class VerificarNumeroParImpar {
     public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
    }
}
