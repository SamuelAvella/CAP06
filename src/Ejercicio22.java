public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = Integer.parseInt(System.console().readLine());
        System.out.printf("%13s \n","@");
        System.out.printf("%13s \n","*");
        int aleatorio = 0, posicion = 0;
        for (int i = 1; i <= longitud-2; i++) {
            if (posicion==0) {
                aleatorio = (int)(Math.random()*3)-1;
                System.out.printf("%"+(13+(aleatorio))+"s \n","*");
            }
            if (posicion==-1) {
                aleatorio = (int)(Math.random()*1)+1;
                System.out.printf("%"+(12+(aleatorio))+"s \n","*");
            }
            if (posicion==1) {
                aleatorio = (int)(Math.random()*1)-1;
                System.out.printf("%"+(14+(aleatorio))+"s \n","*");
            }
            posicion = posicion+aleatorio;
        }
    }
}
