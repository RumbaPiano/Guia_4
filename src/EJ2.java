import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EJ2 {
    public static void main(String[] args){
        Path archivo = Paths.get(args[0]+" "+args[1]);
        //System.out.println(args[0]+" "+args[1]);
        int suma=0;
        try{
            String num = Files.readString(archivo);
            String[] numSep = num.split(" ");
            for(int i=0; i < numSep.length;i++){
                int numero = Integer.parseInt(numSep[i]);
                suma = suma + numero;
            }
            System.out.println(suma);
        }
        catch(IOException exc){
            System.out.println("Algo fallo al leer el archivo");
        }


    }
}
