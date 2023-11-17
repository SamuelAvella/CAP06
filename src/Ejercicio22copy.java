public class Ejercicio22copy {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = Integer.parseInt(System.console().readLine());
        System.out.printf("%13s \n","@");
        System.out.printf("%13s \n","*");
        int x = 13;
        for (int i = 1; i <= longitud-2; i++) {
            x += (int)(Math.random() * 3) - 1;
            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
