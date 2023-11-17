public class Ejercicio17 {
    public static void main(String[] args) {
        int altura = 0, anchura = 0, posicion = 0;
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        altura = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        anchura = Integer.parseInt(System.console().readLine());
        int posicionpez = (int)(Math.random()*(altura-2)*(anchura-2));
        for (int i = 1; i <= 4; i++) {
            if (i==1||i==altura){
                for (int j = 1; j <=anchura; j++)
                    System.out.print("* "); 
                System.out.println();     
            }
            if (i!=1&&i!=altura) {
                System.out.print("* ");
                for (int j = 2; j < anchura; j++) {
                    if (posicion==posicionpez) {
                        System.out.print("& ");
                    } else 
                        System.out.print("  ");
                    posicion++;
                }
                System.out.println("*");
            }     
            
        }
    }
}
