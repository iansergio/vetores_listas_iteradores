import estruturas.Vetor;

public class VetorApp {

    public static void main(String[] args) {
        Vetor vet = new Vetor(10);

        vet.adicionar(2);
        vet.adicionar(7);
        vet.adicionar(9);
        vet.adicionar(12);
        vet.adicionar(16);
        vet.adicionar(21);
        vet.adicionar(27);
        vet.adicionar(33);
        vet.adicionar(42);
        vet.adicionar(54);

        vet.mostrarElementos();
        // Pesquisa binária
        vet.buscaBinaria( vet.getElementos(), 21);
        
        // Adicionar elemento ao inicio do vetor
        vet.mostrarElementos();
        vet.adicionarAoInicio(999);
        vet.mostrarElementos();
    }
}