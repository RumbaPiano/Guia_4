public class Ej1_A {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Ingrese: java Ej1_A.java <num1> <num2> <num3> <a or d>");
        } else {
            int num[] = new int[args.length - 1];
            for (int i = 0; i < args.length - 1; i++) {
                num[i] = Integer.parseInt(args[i]);
            }
            String orden = args[args.length - 1];
            int aux;
            for (int j = 1; j < num.length; j++) {
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
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);
            }
        }
    }
}
