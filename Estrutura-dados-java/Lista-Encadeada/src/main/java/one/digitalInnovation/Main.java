package one.digitalInnovation;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        minhaLista.add("teste 1");
        minhaLista.add("teste 2");
        minhaLista.add("teste 3");
        minhaLista.add("teste 4");

        System.out.println(minhaLista);
        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(3));


        System.out.println("\n" + minhaLista.remove(3) + " <- item removido");

        System.out.println(minhaLista);

    }
}
