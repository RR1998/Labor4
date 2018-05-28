package AbastractFactory.Aritmetica;

import AbastractFactory.AbstractFactory;
import AbastractFactory.Converter.Converter;

public class GeneradorAritmetico implements AbstractFactory{
    //Converter
    @Override
    public  Converter getConversion(){
        return null;
    }
    //Aritmetico
    @Override
    public  Aritmetica getAritmetica(String Type){
        switch (Type){
            case ("Suma"):
                return new Suma();
            case("Resta"):
                return new Resta();
            case("Multiplicacion"):
                return new Multiplicar();
            case("Division"):
                return new Division();
        }
        return null;
    }
}
