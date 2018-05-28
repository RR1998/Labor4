/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import AbastractFactory.AbstractFactory;
import AbastractFactory.Aritmetica.Aritmetica;
import AbastractFactory.Converter.Converter;
import FactoryGenerator.FactoryGenerator;

/**
 *
 * @author Roberto Alexander Rubio Castillo 00259517@uca.edu.sv
 */
public class Ventana extends JPanel {
    private int WIDTH = 300, HEIGHT = 300;
    private int widthTF = 120, heightTF = 80;
    private int widthBT = 90, heightBT = 30;
    JButton BotonSuma, BotonResta, BotonDivision, BotonMultipliacion, Binario;
    JTextField Val1, Val2, Resultado, RBin;// val1 el valor del txtbox1, val2 calor del txtbox2, resultado el total de lo operado, RBin resultado en binario
    
    public Ventana(){
        super();
        BotonSuma = new JButton("Sumar");
        BotonResta = new JButton("Restar");
        BotonDivision = new JButton("Dividir");
        BotonMultipliacion = new JButton("Multiplicar");
        Binario = new JButton("Binario");
        Val1 = new JTextField();
        Val2 = new JTextField();
        Resultado = new JTextField();
        RBin = new JTextField();
        Resultado.setBounds (100, 200, widthTF, heightTF);
        Val1.setBounds (120,40, widthTF, heightTF);
        Val2.setBounds(240, 40, widthTF, heightTF);
        BotonSuma.setBounds(120, 125, widthBT, heightBT);
        BotonResta.setBounds(220, 125, widthBT, heightBT);
        BotonMultipliacion.setBounds(320, 125, widthBT, widthBT);
        BotonDivision.setBounds(420, 125, widthBT, widthBT);
        Binario.setBounds(520, 125, widthBT, widthBT);

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
        Resultado.setEditable(true);
        add(BotonSuma);
        add(BotonResta);
        add(BotonMultipliacion);
        add(BotonDivision);
        add(Val1);
        add(Val2);
        add(Resultado);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
