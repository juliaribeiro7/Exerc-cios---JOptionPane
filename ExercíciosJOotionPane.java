/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercíciosjootionpane;

import javax.swing.JOptionPane;


public class ExercíciosJOotionPane {
   public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");

        double numero = Double.parseDouble(input);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é zero.");
        }
    }
}
