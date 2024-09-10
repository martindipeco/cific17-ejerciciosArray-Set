import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listaArray = new ArrayList<>();

        listaArray.add(1);
        listaArray.add(2);
        listaArray.add(3);
        listaArray.add(1);
        listaArray.add(5);
        listaArray.add(97);

        //muestro el orden en el que están en la lista
        System.out.println("Así está ordenada la lista: " + listaArray);

        //uso HashSet para eliminar duplicados
        HashSet<Integer> setHash = new HashSet<>(listaArray);

        //muestro como quedo el orden
        System.out.println("Así quedó ordenado el set: " + setHash);

        //vuelvo a pasarlo a arrayList
        ArrayList<Integer> listaConHashSet = new ArrayList<>(setHash);

        //muestro de vuelta el orden
        System.out.println("Lista de vuelta: " + listaConHashSet);
        System.out.println("-------------------");


        //repito el mismo procedimiento pero lo hago con LinkedHashSet
        ArrayList<Integer> listaArray2 = new ArrayList<>();

        listaArray2.add(1);
        listaArray2.add(2);
        listaArray2.add(3);
        listaArray2.add(1);
        listaArray2.add(5);
        listaArray2.add(97);

        //muestro el orden en el que están en la lista
        System.out.println("Así está ordenada la lista: " + listaArray2);

        //uso LinkedHashSet para eliminar duplicados manteniendo el orden original
        HashSet<Integer> setLinkedHash = new LinkedHashSet<>(listaArray);

        //muestro como quedo el orden
        System.out.println("Así quedó ordenado el set: " + setLinkedHash);

        //vuelvo a pasarlo a arrayList
        ArrayList<Integer> listaConLinkedHashSet = new ArrayList<>(setLinkedHash);

        //muestro de vuelta el orden
        System.out.println("Lista de vuelta: " + listaConLinkedHashSet);

    }
}