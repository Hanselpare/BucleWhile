package buclewhile;

/**
 *
 * @author maryse
 * 
 * While --> Bucle de muestra con while
 */

public class BucleWhile {
    public void chi(){
                int contador = 0; // inicializa la condición
        while (contador < 6) // condición de prueba
        {
            contador++; // cuerpo del bucle
            System.out.println("contador: " + contador);
        }
        System.out.println("Terminado.Contador: " + contador);
    }
    public static void main(String[] a) {
        BucleWhile bucle = new BucleWhile();
        bucle.chi();
    }
}
