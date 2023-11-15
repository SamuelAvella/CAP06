public class Ejercicio10 {
    public static void main(String[] args) {
        String caracter = "";
        int numcaracter = 0;
        for (int i = 1; i <= 10; i++) {
            int longitud = (int)((Math.random()*40)+1);
            switch (numcaracter) {
                    case 1:
                        caracter = "*";
                        break;
                    case 2:
                        caracter = "-";
                        break;
                    case 3:
                        caracter = "=";
                        break;
                    case 4:
                        caracter = ".";
                        break;
                    case 5:
                        caracter = "|";
                        break;
                    case 6:
                        caracter = "@";
                        break;
                }
            for (int j = 1; j <=longitud; j++) {
                numcaracter = (int)((Math.random()*6)+1);
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
