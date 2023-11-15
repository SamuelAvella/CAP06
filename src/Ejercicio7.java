public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Resultados quiniela esta semana (partido|resultado):");
        int num = 0;
        for (int i = 1; i <= 14; i++) {
            num = (int)((Math.random()*3)+1);
            switch (num) {
                case 1:
                    if (i<10)
                        System.out.println("| "+i+"  | 1 |");   
                    else
                        System.out.println("| "+i+" | 1 |");
                    break;
                case 2:
                    if (i<10)
                        System.out.println("| "+i+"  | X |");   
                    else
                        System.out.println("| "+i+" | X |");
                    break;
                case 3:
                    if (i<10)
                        System.out.println("| "+i+"  | 2 |");   
                    else
                        System.out.println("| "+i+" | 2 |");  
                    break;
            }            
       }
       int pleno = (int)(Math.random()*4);
       if (pleno==3)
            System.out.print("| 15 | M |");
       else
            System.out.printf("| 15 | %d |",pleno);
        
    }
}
