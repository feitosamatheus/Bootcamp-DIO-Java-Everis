package one.digitalInnovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("Nó 1");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("Nó 1");
        System.out.println(minhaLista);


        minhaLista.add("Nó 2");
        minhaLista.add("Nó 3");
        System.out.println(minhaLista);

     //   System.out.println(minhaLista.get(0));
     //   System.out.println(minhaLista.get(1));
     //   System.out.println(minhaLista.get(2));

        for (int i = 0; i <20;i++){
            System.out.println(minhaLista.get(i));
        }

    }
}
