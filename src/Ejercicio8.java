public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Resultados quiniela esta semana (partido|resultado):");
        int num = 0;
        for (int i = 1; i <= 14; i++) {
            num = (int)((Math.random()*6)+1);
            switch (num) {
                case 1,2,3:
                    if (i<10)
                        System.out.println("| "+i+"  | 1 |");   
                    else
                        System.out.println("| "+i+" | 1 |");
                    break;
                case 4,5:
                    if (i<10)
                        System.out.println("| "+i+"  | X |");   
                    else
                        System.out.println("| "+i+" | X |");
                    break;
                case 6:
                    if (i<10)
                        System.out.println("| "+i+"  | 2 |");   
                    else
                        System.out.println("| "+i+" | 2 |");  
                    break;
            }            
       }
       int pleno = (int)(Math.random()*7);
       switch (pleno) {
        case 0:
            System.out.print("| 15 | 0 |");
            break;
        case 1,2,3:
            System.out.print("| 15 | 1 |");
            break;
        case 4,5:
            System.out.print("| 15 | 2 |");
            break;
        case 6:
            System.out.print("| 15 | M |");
            break;
       }
    }
}
