package course;

public class Drawbacks {
    public static void main(String[] args) {
        int nums[] = new int[4]; // tamaño de 4 elementos 

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;

        // DRAWBACK 1: Tamaño Fijo
        // si ocuparamos guardar un  5.º valor (50), no hay espacio disponible por lo que
        // una solución con arreglos tradicionales es crear un nuevo arreglo más grande y copiar los datos.

        // DRAWBACK 2: ArrayIndexOutOfBoundsException
        // al acceder al índice 4 provocará un error en tiempo de ejecución.
        try {
            nums[4] = 50; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }

        // SOLUCIÓN: Usar colecciones dinámicas como ArrayList
        // ArrayList<Integer> dynamicList = new ArrayList<>();
        // dynamicList.add(10); // Crece automáticamente según se necesite
    }
}