package AbastractFactory.Converter;

import AbastractFactory.AbstractFactory;
import AbastractFactory.Aritmetica.Aritmetica;


public class GeneradorBinario implements AbstractFactory{
    @Override
    public Converter getConversion(String Type, int ResultadoA){
        return new Binario();
    }
    @Override
    public Aritmetica getAritmetica(String Type, int val1,int  val2){
        return null;
    }
}
