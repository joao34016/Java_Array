import java.util.Arrays;
public class Ex7 {
    public static void main(String[] args) {
        int[] numeros = {4,7,2,5,7,8,1,6,4,7,2,0};
        Arrays.sort(numeros);

        for (int n:numeros){
            System.out.println("Número: " + n);
        }


    }
}
