import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class busquedaBinaria {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int busquedaBinaria(int[] arr, int objetivo){

        
        int in = 0;
        int ulti = arr.length - 1;

        while (in <= ulti) {
            int m = in + (ulti - in) / 2; 
            if (arr[m] == objetivo) {
                return m; 
            }
            else if (arr[m] < objetivo) {
                in = m + 1;
            }
            else { 
                ulti = m - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int objetivo = 4;
        int bu;
        int ulti = arr.length - 1;
        int in = 0; 

        bu = busquedaBinaria(arr, objetivo);

        System.out.println("El objetivo esta en el indice: " +  bu + " = "  + arr[bu]);


    }
    
    
}