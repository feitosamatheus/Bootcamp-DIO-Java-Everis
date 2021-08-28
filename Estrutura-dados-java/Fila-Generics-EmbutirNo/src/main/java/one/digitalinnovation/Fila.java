package one.digitalinnovation;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object){
        No novoNo = new No(object);

        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    break;
                }

            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }

            }
            return (T) primeiroNo.getObject();

        }
        return null;
    }

    public boolean isEmpty(){
        return  refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = " ";
        stringRetorno += "--- INICIO DA FILA ---\n";

        No noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[one.digitalinnovation.No{objeto " + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    stringRetorno += "\n--- FINAL DA FILA ---\n\n";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
