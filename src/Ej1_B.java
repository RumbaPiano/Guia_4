import java.util.Scanner;

public class Ej1_B {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num[]=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Ingrese un numero:>");
            num[i]=scn.nextInt();
        }
        scn.nextLine();//limpia buffer
        System.out.print("Ingrese si desea ordenar los numeros de manera ascendente (a) o descendente (d):>");
        String orden=scn.nextLine();
        int aux;
        for(int j=1;j<num.length;j++) {
            if (orden.equals("a")) {
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i] > num[i + 1]) {
                        aux = num[i + 1];
                        num[i + 1] = num[i];
                        num[i] = aux;
                    }
                }
            } else if (orden.equals("d")) {
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i] < num[i + 1]) {
                        aux = num[i + 1];
                        num[i + 1] = num[i];
                        num[i] = aux;
                    }
                }
            }
        }
        for(int i=0; i < num.length;i++) {
            System.out.println(num[i]);
        }
    }
}
