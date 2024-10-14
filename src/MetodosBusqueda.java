public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscar){
        //int pos = -1; retornar dentro del if
        int comparaciones= 0;
        long inicioTiempo = System.nanoTime();
        for(int i=0; i<arreglo.length-1; i++){
            if(arreglo[i] == valorBuscar){
                //pos = i;
                //break;
                long finTiempo = System.nanoTime();
                System.out.println("Tiempo en nanosegundos (secuencial): " + (finTiempo - inicioTiempo));
                System.out.println("Numero de comparaciones en secuencial: "+comparaciones);
                return i;
            }
            //pasadas++;
           // System.out.println("Cuastas veces compara: "+ pasadas);
            comparaciones++;
        }
        long finTiempo = System.nanoTime();
        System.out.println("Tiempo en nanosegundos (secuencial): " + (finTiempo - inicioTiempo));
        System.out.println("Numero de comparaciones en secuencial: "+comparaciones);
        return -1;
    }


    public int busquedaBinaria(int[] arr, int value){
        int inicio = 0;
        int fin = arr.length-1;
        int comparar = 0;
        long inicioTiempo = System.nanoTime();
        while (inicio <= fin) { 
            int medio = inicio + (fin - inicio)/2;
            
            if(arr[medio] == value){
                //retorna el elemento encontrado
                long finTiempo = System.nanoTime(); 
                System.out.println("Tiempo en nanosegundos (binaria): " + (finTiempo - inicioTiempo));
                System.out.println("Numero de comparaciones en binaria: "+comparar);
                return medio;
            }

            if(arr[medio] < value){
                inicio = medio +1; // buscar en la mitas de la derecha
            } else{
                fin = medio -1; // buscar a la mitad de la izquierda
            }
            comparar++;
        }
        return -1;
    }

    public void printArreglo(int[] arreglo){
        for(int elem: arreglo)
        {
            System.out.print(elem+" ");
        }
    }

    
}
