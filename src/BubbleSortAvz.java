public class BubbleSortAvz {
    // Variable global;
    int[] array; // tiene valor? No
                 // donde le doy valor? 

    public BubbleSortAvz(int[] arreglo){
        this.array = arreglo;
    }

    public void sort(boolean asc){
        int tam = array.length;
        boolean huboIntercambio;
        int contComparaciones = 0 ;
        for(int i=0; i< tam -1; i++){
            huboIntercambio=false;
            for(int j=0; j<tam -1 -i; j++){
                contComparaciones++;
                if(array[j]> array[j+1]){
                    huboIntercambio = true;
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1]= aux;    
                }
            }
            if(!huboIntercambio){
                break;
            }
        }
        System.out.println("Comparacios totales: " +contComparaciones);
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i+", ");
        }
        System.out.println();
    }

}