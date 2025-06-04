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
public class CompararDoisNumeros {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        int numero1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
        int numero2 = Integer.parseInt(input2);

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O primeiro número (" + numero1 + ") é maior.");
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "O segundo número (" + numero2 + ") é maior.");
        } else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais.");
        }
    }
}
