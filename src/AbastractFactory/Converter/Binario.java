package AbastractFactory.Converter;


public class Binario implements Converter  {
    @Override
    public String Convertir(int Resultado){
        int residuo = 0;
        String Conversion = "";
        if (Resultado == 0){
            return Conversion = "0000";
        }
        if (Resultado == 1){
            return Conversion = "0001";
        }
        while (Resultado != 0 || Resultado != 1){
        residuo = Resultado % 2;
        Conversion = new StringBuilder(Conversion).append(Integer.toString(residuo)).toString();
        }
        return Conversion;
    }
}
