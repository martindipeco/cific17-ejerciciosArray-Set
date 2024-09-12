import java.util.*;

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


        //INTERSECCION: Dadas dos listas de enteros, encuentra los elementos que están presentes en ambas listas
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Agregar elementos a las listas
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        // Encontrar la intersección
        List<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        // Imprimir los elementos en común
        System.out.println("Intersección de las listas: " + intersection);


        //ORDENAR una lista de OBJETOS
        ArrayList<Persona> personas = new ArrayList<>();

        // Agregar personas a la lista
        personas.add(new Persona("Carlos", 30));
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Pedro", 35));
        personas.add(new Persona("Zulema", 20));

        // Ordenar por edad
        Collections.sort(personas, new Comparator<Persona>()
        {
            @Override
            public int compare(Persona p1, Persona p2)
            {
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }
        });

        // Imprimir lista ordenada
        System.out.println("Personas ordenadas por edad");
        for (Persona p : personas) {
            System.out.println(p);
        }


        //Ordenar por nombre
        Collections.sort(personas, new Comparator<Persona>()
        {
            @Override
            public int compare(Persona p1, Persona p2)
            {
                return p1.getNombre().compareTo(p2.getNombre()); // Usa el método nativo "naturalOrder()"
            }
        });

        // Imprimir lista ordenada
        System.out.println("Personas ordenadas por nombre");
        for (Persona p : personas) {
            System.out.println(p);
        }

        //ordenar nuevamente por edad, pero con archivo aparte
        Collections.sort(personas, new ComparadorEdadAsc());

        // Imprimir lista ordenada
        System.out.println("Personas ordenadas por edad");
        for (Persona p : personas) {
            System.out.println(p);
        }


        //REVERTIR una lista
        ArrayList<String> palabras = new ArrayList<>();

        // Agregar palabras
        palabras.add("Primero");
        palabras.add("Segundo");
        palabras.add("Tercero");
        palabras.add("Cuarto");

        // Imprimir lista
        System.out.println("Lista original: " + palabras);


        // Invertir la lista
        Collections.reverse(palabras);

        // Imprimir lista invertida
        System.out.println("Lista invertida: " + palabras);

    }
}