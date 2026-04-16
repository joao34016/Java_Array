import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,2,4,2};
        int vars = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        for(int n:numeros){
            if (n==num) {
                vars+=1;

                
            }
               
            
        }
        
        System.out.println("O número " + num + " aparece " + vars + " vezes");
        scanner.close();
    }

}
