public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Tiramos dos dados hasta que el resultado coincida");
        int dado1 = 0, dado2 = 0;
        do {
           dado1 = (int)(Math.random()*6)+1;
           dado2 = (int)(Math.random()*6)+1; 
           System.out.printf("Ha salido %d y %d",dado1,dado2);
           if (dado1==dado2)
                System.out.print(", han coincidido se acaba el bucle");
            System.out.println();
        } while (dado1!=dado2);
    }
}
