/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class Multiplicar implements Aritmetica{
    @Override
    public int resultado(int val1, int val2){
        return val1 * val2;
    }
}
