public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
        int estacion = Integer.parseInt(System.console().readLine());
        int min = 0, max = 0, minima = 0, nublado = 0;
        switch (estacion) {
            case 1:
                min = 15;
                max = 30;
                nublado = (int)(Math.random()*10)+1;
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                System.out.printf("Temperatura mínima: %dºC\n",(minima=(int)(Math.random()*15)+15)); 
                System.out.printf("Temperatura máxima: %dºC\n",(int)(Math.random()*(30-min))+min);
                switch (nublado) {
                    case 1,2,3,4,5,6:
                        System.out.print("soleado");
                        break;
                    case 7,8,9,10:
                        System.out.print("nublado");
                        break;
                }
                break;
            case 2:
                min = 25;
                max = 45;
                nublado = (int)(Math.random()*10)+1;
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                System.out.printf("Temperatura mínima: %dºC\n",(minima=(int)(Math.random()*25)+20)); 
                System.out.printf("Temperatura máxima: %dºC\n",(int)(Math.random()*(45-min))+min);
                switch (nublado) {
                    case 1,2,3,4,5,6,7,8:
                        System.out.print("soleado");
                        break;
                    case 9,10:
                        System.out.print("nublado");
                        break;
                }
                break;
            case 3:
                min = 20;
                max = 30;
                nublado = (int)(Math.random()*10)+1;
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                System.out.printf("Temperatura mínima: %dºC\n",(minima=(int)(Math.random()*10)+20)); 
                System.out.printf("Temperatura máxima: %dºC\n",(int)(Math.random()*(30-min))+min);
                switch (nublado) {
                    case 1,2,3,4:
                        System.out.print("soleado");
                        break;
                    case 5,6,7,8,9,10:
                        System.out.print("nublado");
                        break;
                }
                break;
            case 4:
                min = 0;
                max = 25;
                nublado = (int)(Math.random()*10)+1;
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                System.out.printf("Temperatura mínima: %dºC\n",(minima=(int)(Math.random()*25))); 
                System.out.printf("Temperatura máxima: %dºC\n",(int)(Math.random()*(25-min))+min);
                switch (nublado) {
                    case 1,2:
                        System.out.print("soleado");
                        break;
                    case 3,4,5,6,7,8,9,10:
                        System.out.print("nublado");
                        break;
                }
                break;
        }
    }
}
