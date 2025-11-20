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

    public static void main(String[] args)throws IOException {
         
        Files files = new Files(); 

        String fileNameInput;
    
        int[] arreglo;

        int objetivo;
        int bu;

        System.out.println("----------------------------------------");
        System.out.print("Escribe el nombre del archivo para buscar: ");
        fileNameInput = bufer.readLine();

        System.out.print("Escribe el elemento a buscar: ");
        entrada = bufer.readLine();
        objetivo = Integer.parseInt(entrada);


        arreglo = files.fileToIntArray(fileNameInput);


        bu = busquedaBinaria(arreglo, objetivo);

        if (bu == -1) {
            System.out.print("Objetivo: " + objetivo + " no encontrado");
        }else{
            System.out.println("El objetivo esta en el indice: " +  bu + " = "  + arreglo[bu]);
        }
        


    }
    
    
}