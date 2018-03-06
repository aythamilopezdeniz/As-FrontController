package Commands;

public class ComandoHelper {
    private Comando comando;

    public ComandoHelper(Comando comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando.toString();
    }
}