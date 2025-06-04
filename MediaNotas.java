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
public class MediaNotas {
     public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        String input2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        String input3 = JOptionPane.showInputDialog("Digite a terceira nota:");

        double nota1 = Double.parseDouble(input1);
        double nota2 = Double.parseDouble(input2);
        double nota3 = Double.parseDouble(input3);

        double media = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, "A média das notas é: " + String.format("%.2f", media));
    }
}
