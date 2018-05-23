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

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel {
    private int WIDTH = 300, HEIGHT = 300;
    private int widthTF = 120, heightTF = 80;
    private int widthBT = 60, heightBT = 30;
    JButton bton = new JButton();
    JTextField textfield1, textfield2;
    
    public Ventana(){
        bton = new JButton("Copiear");
        textfield2 = new JTextField();
        textfield1 = new JTextField();
        textfield2.setBounds (100, 200, widthTF, heightTF);
        textfield1.setBounds (120,40, widthTF, heightTF);
        bton.setBounds(123, 125, widthBT, heightBT);
        bton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(textfield1.getText());
            }
        });
        textfield1.setEditable(true);
        textfield2.setEditable(false);
        add(bton);
        add(textfield1);
        add(textfield2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
    }
}
