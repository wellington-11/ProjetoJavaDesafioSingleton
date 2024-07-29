package one.digitalinnovation.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // Obtendo a instância única do Singleton
        Singleton singletonExemploUm = Singleton.getInstance();
        Singleton singletonExemploDois = Singleton.getInstance();

        singletonExemploUm.MensagemDeCriacaoDeInstancia();

        // Verificando se as duas referências apontam para a mesma instância
        if (singletonExemploUm == singletonExemploDois) {
            System.out.println("As duas variáveis de referências estão na mesma intência");
        } else {
            System.out.println("As variáveis de referência estão em instâncias diferentes");
        }
    }
}

