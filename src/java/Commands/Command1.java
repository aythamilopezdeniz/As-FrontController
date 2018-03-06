package Commands;

import java.io.IOException;
import javax.servlet.ServletException;

public class Command1 extends FrontCommand {

    @Override
    public void process() throws ServletException, IOException {
        Comando comando = Comando.find(request.getParameter("command"));
        request.setAttribute("helper", new ComandoHelper(comando));
        forward("/Pages/comando1.jsp");
    }
}