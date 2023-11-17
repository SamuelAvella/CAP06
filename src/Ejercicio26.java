public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.print("Introduzca la anchura de la tableta: ");
        int ancho = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la tableta: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.println();
        for (int i = 1; i <= altura; i++) {
            int x = ancho;
            x += (int)(Math.random()*2)-1;
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();;
        }
    }
}
