public class NoDuplo {
    public int dado;

    public NoDuplo proximo;
    public NoDuplo anterior;

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

    public NoDuplo(int dado) {
        this.dado = dado;
    }
}
