public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.print("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos: ");
        System.console().readLine();
        int intento = 0, oportunidades = 7, min = 0, max = 100;
        boolean salir = false;
        System.out.println();
        do {
            intento = (int)(Math.random()*(max-min+1))+min;
            System.out.println("¿Tu número es el "+intento+"?");
            System.out.print("He acertado el número (pulsa 1), o el número que piensas es: 2)mayor o 3)menor : ");
            int opcion = Integer.parseInt(System.console().readLine());
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.println("¡Bien, he acertado! Gracias por jugar");
                    salir = true;
                    break;
                case 2:
                    min = intento;
                    break;
                case 3:
                    max = intento;
                    break;
            }
            oportunidades--;
            if (oportunidades==0) {
                System.out.println("He agotado mis intentos, gracias por jugar");
            }
        } while (!salir&&oportunidades>0);
        
        
    }
}
