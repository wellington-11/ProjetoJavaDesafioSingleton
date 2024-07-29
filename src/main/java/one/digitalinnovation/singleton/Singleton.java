package one.digitalinnovation.singleton;


/**
 * Singleton my
 */
public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
                if (instance == null) {
                    instance = new Singleton();
                }
        }
        return instance;
    }
    public void MensagemDeCriacaoDeInstancia() {
        System.out.println("Instância criada com sucesso!");
    }
}

