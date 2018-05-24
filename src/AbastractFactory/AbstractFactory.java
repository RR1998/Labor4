/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory;

import AbastractFactory.Aritmetica.Aritmetica;
import AbastractFactory.Converter.Converter;
/**
 *
 * @author Roberto Alexander Rubio Castillo 00259517@uca.edu.sv
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String Type, int val1, int val2);
    Converter getConversion(String Type, int ResultadoA);
}