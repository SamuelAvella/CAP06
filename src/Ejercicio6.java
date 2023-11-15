public class Ejercicio6 {
    public static void main(String[] args) {
        int num = 0, oportunidades = 0;
        System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");
        num = (int)(Math.random()*101);
        boolean salir = false;
        System.out.println();
        do {
            System.out.print("Introduce el número: ");
            int numIntroducido = Integer.parseInt(System.console().readLine());
            if (numIntroducido!=num)
                oportunidades++;
                if (numIntroducido<num)
                    System.out.println("El número introducido es menor que el que debes adivinar, inténtelo otra vez");
                if (numIntroducido>num)
                    System.out.println("El número introducido es mayor que el que debes adivinar, inténtelo otra vez");
            System.out.println();
            if (oportunidades==5){
                System.out.print("Ha agotado todas sus oportunidades");
                salir = true;
            }
            if (numIntroducido==num){
                System.out.print("Ha adivinado el número");
                salir=true;
            }
        } while (!salir);
    }
}
