package AbastractFactory.Converter;

import AbastractFactory.AbstractFactory;
import AbastractFactory.Aritmetica.Aritmetica;


public class GeneradorBinario implements AbstractFactory{
    @Override
    public Converter getConversion(int Valor){
        return new Binario();
    }
    @Override
    public Aritmetica getAritmetica(String Type){
        return null;
    }
}
