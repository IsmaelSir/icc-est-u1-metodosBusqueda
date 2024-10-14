import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        MetodosBusqueda metodosbusqueda = new MetodosBusqueda();

        int[] arreglo = {10,20,30,40,50,60,70,80,90,100};

        //metodosbusqueda.printArreglo(arreglo);
        System.out.println();
        /*int posicion =  metodosbusqueda.busquedaSecuencial(arreglo, 50);
        if(posicion != -1){
            System.out.println("el valor se encuentra en la posicion: "+posicion);
        }else{
            System.out.println("valor no encontrado");
        }*/
        
        int[] arr = new int[100000];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = i;
        }
        int posicion = metodosbusqueda.busquedaBinaria(arr, 50418);
        int pos = metodosbusqueda.busquedaSecuencial(arr, 50418);
        System.out.println("posicion de binaria: "+posicion);
        System.out.println("posicion de secuencial: "+pos);
    }
}
