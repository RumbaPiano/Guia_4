import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Ej3 {
    public static void main(String[] args){
        Path archivoin = Paths.get(args[2]+" "+args[3]);
        Path archivoout = Paths.get(args[4]+" "+args[5]);
        int desp=Integer.parseInt(args[1]);
        String abcd="abcdefghijklmnopqrstuvwxyz ";
        int aux;
        try{
            String str1 = Files.readString(archivoin);
            char letras[]=new char[str1.length()];
            //Codificación
            if(args[0].equals("cod")) {
                for (int i = 0; i < str1.length(); i++) {
                    for (int j = 0; j < abcd.length(); j++) {
                        if ((str1.charAt(i) == abcd.charAt(j)) && (j + desp < abcd.length())) {
                            letras[i] = abcd.charAt(j + desp);
                            j = abcd.length();
                        } else if ((str1.charAt(i) == abcd.charAt(j)) && (j + desp >= abcd.length())) {
                            aux = j + desp - abcd.length();
                            letras[i] = abcd.charAt(aux);
                            j = abcd.length();
                        }
                    }
                }
            }//Decodificación
            else if(args[0].equals("decod")){
                for(int i=0;i<str1.length();i++){
                    for(int j=abcd.length()-1;j>=0;j--){
                        if((str1.charAt(i)==abcd.charAt(j))&&(j-desp>=0)){
                            letras[i]=abcd.charAt(j-desp);
                            j=-1;
                        }else if((str1.charAt(i)==abcd.charAt(j))&&(j-desp<0)){
                            aux=j-desp+abcd.length();
                            letras[i]=abcd.charAt(aux);
                            j=-1;
                        }
                    }
                }
            }
            String str2=String.valueOf(letras);
            try{
                Files.writeString(archivoout, str2);
            }
            catch(IOException exc2){
                System.out.println("Algo fallo al escribir el archivo de salida");
            }
        }
        catch(IOException exc1){
            System.out.println("Algo fallo al leer el archivo de entrada");
        }
    }
}
