public class Ejercicio3 {
    public static void main(String[] args) {
        String Palo = "";
        String Carta = "";
        System.out.println("Carta aleatoria de la baraja española:");
        int palo = (int)(Math.random()*4)+1;
        switch (palo) {
            case 1: 
                Palo = "oros";
                break;
            case 2: 
                Palo = "copas";
                break;
            case 3: 
                Palo = "bastos";
                break;
            case 4: 
                Palo = "espadas";
                break;

        }
        int carta = (int)(Math.random()*10)+1;
        switch (carta) {
            case 8: 
                Carta = "Sota";
                break;
            case 9: 
                Carta = "Caballo";
                break;
            case 10: 
                Carta = "Rey";
                break;
            default:
                Carta = String.valueOf(carta);
                break;
        }
        System.out.printf("%s de %s", Carta,Palo);
    }
}
