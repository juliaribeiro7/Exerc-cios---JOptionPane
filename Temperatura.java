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
public class Temperatura {
     public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));

        double fahrenheit = celsius * 1.8 + 32;

        JOptionPane.showMessageDialog(null, celsius + "°C é igual a " + fahrenheit + "°F");
    }
}
