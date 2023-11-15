public class Ejercicio1 {
    public static void main(String[] args) {
        int suma = 0;
        System.out.print("Tira tres dados y dan: ");
        for (int i = 1; i <= 3; i++) {
            int dado = (int)((Math.random()*6)+1);
            System.out.print(dado+" ");
            suma = suma + dado;
        }
        System.out.println();
        System.out.printf("La suma de las tres tiradas es: %d",suma);
    }
}