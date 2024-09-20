// Arreglos en java 1 y 2 dimensiones
public class Run {
    public static void main(String[] args) {
        // Arreglo unidimensional
        int[] arreglo1D = new int[5];
        
        // inicializar y asignar valores a cada posicion
        arreglo1D[0] = 10;
        arreglo1D[1] = 20;
        arreglo1D[2] = 30;
        arreglo1D[3] = 40;
        arreglo1D[4] = 50;

        System.out.println(arreglo1D[4]);

        int[] [] otraForma2D = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // for( int i =0; i<arreglo2D.length; i++ ){
        //     for( int j =0; j<arreglo2D[i].length; j++){
        //         System.out.println(arreglo2D[i] [j] + "/");
        //     }
        // }

    }
    
}