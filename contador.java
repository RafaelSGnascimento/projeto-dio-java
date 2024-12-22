import java.util.Scanner;

// Classe de exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Mensagem corrigida
            System.out.println("ERRO: O primeiro parâmetro deve ser menor que o segundo.");
            System.out.println("Detalhes: " + e.getMessage()); // Corrigido o operador de concatenação
        }

        terminal.close(); // Fechar o scanner para evitar vazamento de recurso
    }

    // Método que executa a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Intervalo inválido: " + parametroUm + " > " + parametroDois);
        }
        int contagem = parametroDois - parametroUm;

        // Realizar a contagem
        System.out.println("Contagem: Contando " + contagem + " numeros!");
        for (int i = 1; i <= contagem; i++) { 
            System.out.println(i); 
        }        
    }
}
