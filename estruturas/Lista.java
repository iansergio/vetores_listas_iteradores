package estruturas;

public class Lista {

    public No inicio;

    public void Lista() {
        this.inicio = null;
    }

    public void adicionarAoInicio(int valor) {
        No no = new No(valor);

        if (this.inicio == null) {
            this.inicio = no;
            return;
        }

        this.inicio.anterior = no;

        no.proximo = this.inicio;
        this.inicio = no;
    }

    public void mostrarNos() {
        Iterador iterador = this.getIterador();
        
        while (iterador.getAtual() != null) {
            iterador.display();
        }
    }

    public void remover(int valor) {
        No noAux = this.inicio;

        while (noAux != null && noAux.dado != valor) {
            noAux = noAux.proximo;
        }

        if (noAux == null) {
            System.out.println("Valor não encontrado");
            return;
        }

        noAux.anterior.proximo = noAux.proximo;
        noAux.proximo.anterior = noAux.anterior;
    }

    public Iterador getIterador() {
        return new Iterador(this, this.inicio);
    }
}
