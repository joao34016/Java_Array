public class Ex2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maior = numeros[0];
        int menor = numeros[0];
        for (int n:numeros){
            if (n>maior){
                maior=n;
            }
            if (n<menor){
                menor=n;
            }
    

            
        }
        System.out.println("O maior valor é: "+ maior);
        System.out.println("O menor valor é: "+ menor);
    }
}
