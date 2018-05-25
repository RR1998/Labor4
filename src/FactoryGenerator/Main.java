/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryGenerator;

import GUI.Ventana;
import javax.swing.JFrame;
import AbastractFactory.Aritmetica.Aritmetica;
import AbastractFactory.Converter.Converter;
/**
 *
 * @author Roberto Alexander Rubio Castillo 00259517@uca.edu.sv
 */
public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame ("Mi Ventana");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
}
