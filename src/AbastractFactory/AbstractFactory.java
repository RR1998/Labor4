/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Aritmetica getShape(int val1, int val2);
    Converter getColor(int val1, int val2);
}