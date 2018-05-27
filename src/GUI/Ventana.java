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
import AbastractFactory.Aritmetica.GeneradorAritmetico;
import FactoryGenerator.FactoryGenerator;

/**
 *
 * @author Roberto Alexander Rubio Castillo 00259517@uca.edu.sv
 */
public class Ventana extends JPanel {
    private int WIDTH = 300, HEIGHT = 300;
    private int widthTF = 120, heightTF = 80;
    private int widthBT = 60, heightBT = 30;
    JButton BotonSuma, BotonResta, BotonDivision, BotonMultipliacion, Binario;
    JTextField Val1, Val2, Resultado, RBin;// val1 el valor del txtbox1, val2 calor del txtbox2, resultado el total de lo operado, RBin resultado en binario
    
    public Ventana(){
        BotonSuma = new JButton("Sumar");
        BotonResta = new JButton("Restar");
        BotonDivision = new JButton("Dividir");
        BotonMultipliacion = new JButton("Multiplicar");
        Val1 = new JTextField();
        Val2 = new JTextField();
        Resultado = new JTextField();
        RBin = new JTextField();
        Resultado.setBounds (100, 200, widthTF, heightTF);
        Val1.setBounds (120,40, widthTF, heightTF);
        BotonSuma.setBounds(123, 125, widthBT, heightBT);

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
        Val1.setEditable(true);
        Val2.setEditable(true);
        Resultado.setEditable(true);
        add(BotonSuma);
        add(Val1);
        add(Resultado);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
}
