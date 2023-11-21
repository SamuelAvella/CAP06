public class Ejercicio20 {
    public static void main(String[] args) {
        int litro = 0, litroAleatorio = 0;
        boolean salir = false;
        while (!salir) {
            try {
                System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
                litro = Integer.parseInt(System.console().readLine());
                if (litro < 1)
                    System.out.println("Por favor, mínimo un litro");
                else 
                    salir = true;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error");
            }
        }
        litroAleatorio = (int)(Math.random()*litro)+1;
        for (int i = 1; i <= litro; i++) {
            System.out.print(RESET+"\u2588");
            for (int j = 1; j <= 4; j++) {
                if (litroAleatorio>i)
                    System.out.print(" ");
                if (litroAleatorio<=i)
                    System.out.print(BLUE+"\u2588");
            }
            System.out.println(RESET+"\u2588");
        }
        for (int i = 1; i <= 6; i++) {
            System.out.print(RESET+"\u2580");
        }
    }
    public static final String BLUE = "\033[0;34m";
    public static final String RESET = "\033[0m";
    public static final String BLUE_BACKGROUND = "\033[44m";
}
