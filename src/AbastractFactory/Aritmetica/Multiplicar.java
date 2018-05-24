/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory.Aritmetica;

/**
 *
 * @author Roberto Alexander Rubio Castillo 00259517@uca.edu.sv
 */
public class Multiplicar implements Aritmetica{
    @Override
    public int Resultado(int val1, int val2){
        return val1 * val2;
    }
}
