/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import AbastractFactory.AbstractFactory;
import AbastractFactory.Aritmetica.Aritmetica;
import AbastractFactory.Converter.Converter;
import FactoryGenerator.FactoryGenerator;

/**
 *
 * @author Roberto Alexander Rubio Castillo 00259517@uca.edu.sv
 */
public class Ventana extends JFrame {
    private int WIDTH = 450, HEIGHT = 350;
    private int widthTF = 120, heightTF = 80;
    private int widthBT = 90, heightBT = 30;
    JButton BotonSuma, BotonResta, BotonDivision, BotonMultipliacion, Binario;
    JTextField Val1, Val2, Resultado, RBin;// val1 el valor del txtbox1, val2 calor del txtbox2, resultado el total de lo operado, RBin resultado en binario
    
    public Ventana(){
        super();
        setTitle("Calculadora");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BotonSuma = new JButton("Sumar");
        BotonResta = new JButton("Restar");
        BotonDivision = new JButton("Dividir");
        BotonMultipliacion = new JButton("Multiplicar");
        Binario = new JButton("Binario");
        Val1 = new JTextField();
        Val2 = new JTextField();
        Resultado = new JTextField();
        RBin = new JTextField();
        Val1.setBounds (120,40, widthTF, heightTF);
        Val2.setBounds(240, 40, widthTF, heightTF);
        Resultado.setBounds (120, 200, widthTF, heightTF);
        BotonSuma.setBounds(120, 125, widthBT, heightBT);
        BotonResta.setBounds(220, 125, widthBT, heightBT);
        BotonMultipliacion.setBounds(120, 150, widthBT, heightBT);
        BotonDivision.setBounds(220, 150, widthBT, heightBT);
        Binario.setBounds(320, 125, widthBT, heightBT);

        BotonSuma.addActionListener(e -> {
            AbstractFactory Factory;
            Factory = FactoryGenerator.getFactory("Aritmetica");
            Aritmetica Suma = Factory.getAritmetica("Suma");
            Resultado.setText(Integer.toString(Suma.Resultado(Integer.parseInt(Val1.getText()), Integer.parseInt(Val2.getText()))));
        });

        BotonResta.addActionListener(e -> {
            AbstractFactory Factory;
            Factory = FactoryGenerator.getFactory("Aritmetica");
            Aritmetica Resta = Factory.getAritmetica("Resta");
            Resultado.setText(Integer.toString(Resta.Resultado(Integer.parseInt(Val1.getText()), Integer.parseInt(Val2.getText()))));
            });

        BotonMultipliacion.addActionListener(e -> { //e-> es igual a new ActionListener
            AbstractFactory Factory;
            Factory = FactoryGenerator.getFactory("Aritmetica");
            Aritmetica Multiplicacion = Factory.getAritmetica("Multiplicacion");
            Resultado.setText(Integer.toString(Multiplicacion.Resultado(Integer.parseInt(Val1.getText()), Integer.parseInt(Val2.getText()))));
        });

        BotonDivision.addActionListener(e -> {
            AbstractFactory Factory;
            Factory = FactoryGenerator.getFactory("Aritmetica");
            Aritmetica Division = Factory.getAritmetica("Division");
            Resultado.setText(Integer.toString(Division.Resultado(Integer.parseInt(Val1.getText()), Integer.parseInt(Val2.getText()))));
        });

        Binario.addActionListener(e -> {
            AbstractFactory Factory;
            Factory = FactoryGenerator.getFactory("Binario");
            Converter Binario = Factory.getConversion();
            Resultado.setText(Binario.Convertir(Integer.parseInt(Val1.getText())));
        });

        Val1.setEditable(true);
        Val2.setEditable(true);
        Resultado.setEditable(false);
        add(BotonSuma);
        add(BotonResta);
        add(BotonMultipliacion);
        add(BotonDivision);
        add(Binario);
        add(Val1);
        add(Val2);
        add(Resultado);
        /*setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        */
    }
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(() -> new Ventana().setVisible(true));
    }
}
