package Java;

public class AreadelTrianguloEquilatero {
    
    public class AreaDeUnTrianguloEquilatero {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            double area, lado;
            System.out.print("Ingresa el valor de lado: ");
            lado = in.nextDouble();
            in.nextLine();
            area=Math.sqrt(3)*lado*lado/4;
            System.out.println("Valor de area: " + area);
        }
    
    }
    