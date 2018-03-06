package Commands;

public class Comando {
    private static String command;

    private Comando(String parameter) {
        command = parameter;
    }

    public static Comando find(String parameter) {
        sendComand(parameter);
        return new Comando(parameter);
    }

    private static void sendComand(String parameter) {
        command = parameter;
    }

    public static String getCommand() {
        return command;
    }
}