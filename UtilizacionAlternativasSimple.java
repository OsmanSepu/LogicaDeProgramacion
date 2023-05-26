package Java;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UtilizacionAlternativasSimple {

    public static void main(String args[]) {
        
        byte nota=0;
        String tareaEntregada= " ";
        BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Introduzca nota obtenida: ");
            nota = (byte)Integer.parseInt(BufferedReader.readLine());
            System.out.print("se han entregado las tareas (S/N)");
            tareaEntregada=BufferedReader.readLine();

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            
        }
        if (nota >= 5 && (tareaEntregada.charAt(0)=='S' || tareaEntregada.charAt(0)=='s'))
        {
            System.out.println("Aprovado");
        } 
        else {
            System.out.println("Suspendido");

        }


    }
}
