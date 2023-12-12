public class Juego7 {
    public static String carta (String Carta) {
        int carta = (int)(Math.random()*10)+1;
        switch (carta) {
            case 1,2,3,4,5,6,7:
                Carta= Integer.toString(carta);
                break;
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
        return Carta;
    }
    public static String palo (String Palo){
        int palo = (int)(Math.random()*4)+1;
        switch (palo) {
            case 1: 
                Palo = " de oros";
                break;
            case 2: 
                Palo = " de copas";
                break;
            case 3: 
                Palo = " de bastos";
                break;
            case 4: 
                Palo = " de espadas";
                break;

        }
        return Palo;
    }
        
    public static void main(String[] args) {
        String Palo="", Carta="";
        Boolean salir = false;
        double puntos = 0;
        System.out.print("Su primera carta es: ");
        while(!salir) {
            switch (carta(Carta)) {
                case "1":
                    System.out.println("1"+palo(Palo));
                    puntos=puntos+1;
                    break;
                case "2":
                    System.out.println("2"+palo(Palo));
                    puntos=puntos+2;
                    break;
                case "3":
                    System.out.println("3"+palo(Palo));
                    puntos=puntos+3;
                    break;
                case "4":
                    System.out.println("4"+palo(Palo));
                    puntos=puntos+4;
                    break;
                case "5":
                    System.out.println("5"+palo(Palo));
                    puntos=puntos+5;
                    break;
                case "6":
                    System.out.println("6"+palo(Palo));
                    puntos=puntos+6;
                    break;
                case "7":
                    System.out.println("7"+palo(Palo));
                    puntos=puntos+7;
                    break;
                case "8":
                    System.out.println("8"+palo(Palo));
                    puntos=puntos+8;
                    break;
                case "Sota":
                    System.out.println("Sota"+palo(Palo));
                    puntos=puntos+0.5;
                    break;
                case "Caballo":
                    System.out.println("Caballo"+palo(Palo));
                    puntos=puntos+0.5;
                    break;
                case "Rey":
                    System.out.println("Rey"+palo(Palo));
                    puntos=puntos+0.5;
                    break;
            }
            if (puntos<7.5){
                System.out.print("Desea pedir otra carta (s o n): ");
                String respuesta = System.console().readLine();
                respuesta = respuesta.toLowerCase();
                switch (respuesta) {
                    case "s":
                        salir=false;
                        System.out.print("Su siguiente carta es: ");
                        break;
                    case "n":
                        salir=true;
                }
            }  else if (puntos>7.5)
                salir = true;
        }
        System.out.print("Su puntuación final ha sido: "+puntos+" puntos");
    }
}
