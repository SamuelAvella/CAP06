public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("20 notas aleatorias: ");
        int notas = 0, suspensos = 0, suficientes = 0, bienes = 0, notables = 0, sobresalientes = 0;
        for (int i = 1; i <= 20; i++) {
            notas = (int)((Math.random()*4)+1);
            switch (notas) {
                case 1:
                    System.out.println("- suspenso");
                    suspensos++;
                    break;
                case 2:
                    System.out.println("- suficiente");
                    suficientes++;
                    break;
                case 3:
                    System.out.println("- bien");
                    bienes++;
                    break;
                case 4:
                    System.out.println("- notable");
                    notables++;
                    break;
                case 5:
                    System.out.println("- sobresaliente");
                    sobresalientes++;
                    break;
            }
        }
        System.out.println();
        System.out.printf("El número de suspesnos es: %d\nEl número de suficientes es: %d\nEl número de bienes es: %d\nEl número de notables es: %d\nEl número de sobresalientes es: %d",suspensos,suficientes,bienes,notables,sobresalientes);
    }
}
