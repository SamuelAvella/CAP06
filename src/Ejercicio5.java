public class Ejercicio5 {
    public static void main(String[] args) {
        int max = 100 , min = 199 , suma = 0 , num = 0;
        System.out.println("50 números enteros aleatorios entre 100 y 199 (ambos incluidos):");
        for (int i = 1; i <= 50; i++) {
            num = (int)((Math.random()*100)+100);
            System.out.print(num+"  ");
            suma=suma+num;
            if (num>max)
                max = num;
            if (num<min)
                min = num;
        }
        System.out.println();
        System.out.printf("De entre los números aleatorios el máximo es %d, el mínimo %d y la media de los 50 es %d",max,min,(suma/50));
    }
}
