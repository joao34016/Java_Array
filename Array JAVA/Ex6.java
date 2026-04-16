import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = scanner.nextInt();
        int not = 0;
        int not2 = 0;
        for (int n:numeros){
            if (n == num){
                System.out.println("Esse número já existe no array. ");
                not2 = 1;
                break;
            }else{
                not = 1;
                
                
            } 
            
            


        }
        if (not==1 && not2==0){
            System.out.println("Não está no array. ");
        }
        scanner.close();
    }
    
}
