package estruturas;

public class Vetor {

    public Integer[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    public void adicionar(Integer valor) {
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    private void aumentarCapacidade() {
        int novaCapacidade = this.capacidade + (this.capacidade / 2);
        Integer[] novosElementos = new Integer[novaCapacidade];

        for (int i = 0; i < this.tamanho; i++) {
            novosElementos[i] = this.elementos[i];
        }
        this.elementos = novosElementos;
        this.capacidade = novaCapacidade;
    }

    public void mostrarElementos() {
        System.out.println("-----");
        System.out.println("Elementos no vetor");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
        System.out.println("-----");
    }

    public void contem(Integer valor) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i] == valor) {
                System.out.println("Valor encontrado");
                return;
            }
        }
        System.out.println("Valor não encontrado");
    }

    public void remover(int posicao) {
        if (posicao > this.tamanho) {
            System.out.println("Posição informada é inválida");
            return;
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }

    public void removerPorValor(Integer valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == valor) {
                this.remover(i);
                System.out.println("Item removido");
                return;
            }
        }
        System.out.println("Item não encontrado");
    }

    // Getter
    public Integer[] getElementos() {
        return this.elementos;
    }

    // Busca binária pelo valor informado
    public Integer buscaBinaria(Integer[] elementos, Integer valor) {
        int menor = 0;
        int maior = this.tamanho - 1;

        while (menor <= maior) {
            int meio = (menor + maior) / 2;
            if (meio % 2 != 0){
                meio = Math.round(meio);
            }
            int chute = elementos[meio];
            if (chute == valor) {
                System.out.println("O número foi encontrado!"); 
                return meio;
            }
            if (chute > valor) {
                maior = meio - 1;
            }
            else {
                menor = meio + 1;
            }
        }

        return null;
    }

    // Inserir um item no início do vetor
    public void adicionarAoInicio(Integer valor) {
        int aux;
        
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }
        
        for (int i=0; i<this.tamanho; i++) {
            aux = this.elementos[i];
            this.elementos[i] = valor;
            valor = aux;
        }
        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }
}
