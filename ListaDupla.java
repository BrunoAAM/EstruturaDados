public class ListaDupla {
    private NoDuplo inicio;
    private NoDuplo fim;
    private int size;



    public void inserir(int elemento) throws Exception {
        NoDuplo novoelemento = new NoDuplo(elemento);
        NoDuplo aux = inicio;
        if(inicio == null){
            novoelemento.proximo = null;
            novoelemento.anterior = null;
            inicio = novoelemento;
            fim = novoelemento;
        }else {while (aux.proximo != null){
                aux = aux.proximo;}
                novoelemento.proximo = null;
                aux.proximo = novoelemento;
                novoelemento.anterior = aux;
                fim = novoelemento;
        }size++;

    }

    public void inserirPosiçao(int elemento, int posiçao) throws Exception{
        if (posiçao < 0 || posiçao > size()){
            throw new Exception("Posição inválida");
        }
        NoDuplo novoelemento = new NoDuplo(elemento);
        NoDuplo aux = inicio;

        if (posiçao == 0){
            if (size() !=0){
                novoelemento.proximo = aux;
                aux.anterior = novoelemento;
                inicio = novoelemento;
                novoelemento.anterior = null;
            }else {
                inicio = novoelemento;
            }
        }else {
            int cont = 1;
            while (cont<posiçao){
                aux = aux.proximo;
                cont++;
            }
            novoelemento.proximo = aux.proximo;
            novoelemento.anterior = aux;
            aux.proximo = novoelemento;
        }size++;
    }
//
    public int removeIndex(int i) throws Exception{
        NoDuplo aux = inicio;
        NoDuplo lixo = null;
        if (size() ==0)
            throw new Exception("Lista Vazia");
        if (i < 0 || i > size())
            throw new Exception("Indice não existente");
        if (i==0){
            lixo = aux;
            aux = aux.proximo;
            inicio = aux;
        }else {
            int cont = 0;
            while (cont < i){
                aux= aux.proximo;
                cont++;
            }
            lixo = aux;
            aux.anterior.proximo = aux.proximo;
            if (aux != fim)
                aux.proximo.anterior = aux.anterior;
            else
            fim = aux;

        }

        return lixo.dado;
    }

    public int index(int elemento) throws Exception {
        if (size() == 0) {
            throw new Exception("Lista Vazia");
        }
        NoDuplo aux = inicio;
        int cont = 0;
        while (aux != null) {
            if (aux.dado == elemento) {
                return cont;
            } else {
                aux = aux.proximo;
                cont++;
            }

        }throw new Exception("-1");
    }


    public int size(){
      return size;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        NoDuplo p = inicio;
        while (p != null) {
            sb.append(p.dado + " ");
            p = p.proximo;
        }

        sb.append("]");
        return sb.toString();
    }


}
