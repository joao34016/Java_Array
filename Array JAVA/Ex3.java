public class Ex3 {
    public static void main(String[] args) {
        int[] numeros={1,2,3,4,5,6,7,8,9,10};
        double soma= 0;
        for (int n:numeros){
            soma = soma+n;

        }
        double media = soma/numeros.length;
        System.out.println("A média é: " + media);
    }
}
