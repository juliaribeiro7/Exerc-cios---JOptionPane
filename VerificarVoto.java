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
public class VerificarVoto {
     public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite sua nacionalidade:");

        if (idade >= 16 && nacionalidade.equalsIgnoreCase("brasileira")) {
            JOptionPane.showMessageDialog(null, "Você pode votar!");
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode votar.");
        }
    }
}
