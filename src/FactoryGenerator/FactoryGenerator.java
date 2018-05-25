/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryGenerator;

import AbastractFactory.AbstractFactory;
import AbastractFactory.Aritmetica.GeneradorAritmetico;
import AbastractFactory.Converter.GeneradorBinario;

/**
 *
 * @author Roberto Alexander Rubio Castillo 00259517@uca.edu.sv
 */

public class FactoryGenerator {
    public static AbstractFactory getFactory(String Type){
        switch (Type){
            case "Aritmetica":
                return new GeneradorAritmetico();
            case "Binario":
                return new GeneradorBinario();
        }
        return null;
    }
    
}
