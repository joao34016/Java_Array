public class Ex4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int par = 0;
        for (int n:numeros){
            if (n%2==0){
                par+=1;          
            }
        }
        System.out.println("A quantidade de números pares é: " + par);
    }
}
