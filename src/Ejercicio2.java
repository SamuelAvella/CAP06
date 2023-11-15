public class Ejercicio2 {
    public static void main(String[] args) {
        String Palo = "";
        String Carta = "";
        System.out.println("Carta aleatoria de la baraja frances:");
        int palo = (int)(Math.random()*4)+1;
        switch (palo) {
            case 1: 
                Palo = "picas";
                break;
            case 2: 
                Palo = "corazones";
                break;
            case 3: 
                Palo = "diamantes";
                break;
            case 4: 
                Palo = "tréboles";
                break;

        }
        int carta = (int)(Math.random()*13)+1;
        switch (carta) {
            case 1: 
                Carta = "A";
                break;
            case 11: 
                Carta = "J";
                break;
            case 12: 
                Carta = "Q";
                break;
            case 13: 
                Carta = "K";
                break;
            default:
                Carta = String.valueOf(carta);
                break;
        }
        System.out.printf("%s de %s", Carta,Palo);
    }
}
