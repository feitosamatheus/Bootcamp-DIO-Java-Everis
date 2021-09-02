package one.digitalInnovation;

import one.digitalInnovation.model.Obj;



public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();
        minhaArvore.inseir(new Obj(13));
        minhaArvore.inseir(new Obj(10));
        minhaArvore.inseir(new Obj(25));
        minhaArvore.inseir(new Obj(2));
        minhaArvore.inseir(new Obj(12));
        minhaArvore.inseir(new Obj(20));
        minhaArvore.inseir(new Obj(31));
        minhaArvore.inseir(new Obj(29));
        minhaArvore.inseir(new Obj(32));


        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirPreOrdem();
        System.out.println("\n\n----------Utilizando método remove --------------------");

        minhaArvore.remove(new Obj(32));
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirPreOrdem();
    }
}
