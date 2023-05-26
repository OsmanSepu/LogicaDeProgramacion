package Java;

public class UtilizacionJava {
    
    public static void main(String[] args) {
        byte numeroMes = 4;
        switch (numeroMes)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("El Mes tiene 31 Dias");
            break:
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("El mes Tiene 30 Dias");
            break:
            case 2: System.out.println("El mes de Febrero puede tener 28 o 29 dias segun el año");




        }
    }
}
