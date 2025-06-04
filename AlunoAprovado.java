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
public class AlunoAprovado {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a nota do aluno:");

        double nota = Double.parseDouble(input);

        if (nota >= 7.0) {
            JOptionPane.showMessageDialog(null, "Aluno Aprovado!");
        } else if (nota >= 5.0 & nota < 7.0) {
            JOptionPane.showMessageDialog(null, "Aluno em Recuperação.");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno Reprovado.");
        }
    }
}
