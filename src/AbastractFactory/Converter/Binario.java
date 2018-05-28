package AbastractFactory.Converter;


public class Binario implements Converter  {
    @Override
    public String Convertir(int Resultado){
        int Residuo = 0;
        String Conversion = "";
        if (Resultado == 0){
            return Conversion = "0000";
        }
        if (Resultado == 1){
            return Conversion = "0001";
        }
        while (Resultado != 0){
        Residuo = Resultado % 2;
        Resultado = Resultado / 2;
        Conversion = new StringBuilder(Conversion).append(Integer.toString(Residuo)).toString();
        }
        return new StringBuffer(Conversion).reverse().toString();
    }
}
