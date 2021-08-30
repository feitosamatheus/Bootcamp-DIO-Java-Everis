package one.digitalInnovation;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        minhaLista.add("texto1");
        minhaLista.add("texto2");
        minhaLista.add("texto3");
        minhaLista.add("texto4");
        minhaLista.add("texto5");
        minhaLista.add("texto6");
        minhaLista.add("texto7");

        System.out.println(minhaLista);

        minhaLista.remove(3);
        minhaLista.add(1,"99");

        System.out.println(minhaLista);

        System.out.println(minhaLista.get(1));




    }

}
