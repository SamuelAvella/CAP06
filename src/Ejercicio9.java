public class Ejercicio9 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Número pares y aleatorios entre 0 y 100");
        do {
            num = (int)(Math.random()*101);
            if (num%2==0)
                System.out.print(num+" ");
        } while (num!=24);
        System.out.println();
        System.out.print("Se acaba la generación porque ha salido el 24");
    }
}
