package Commands;

import java.io.IOException;
import javax.servlet.ServletException;

public class Command2 extends FrontCommand {

    @Override
    public void process() throws ServletException, IOException {
        Comando comando = Comando.find(request.getParameter("command"));
        System.out.println(comando);
        request.setAttribute("helper", new ComandoHelper(comando));
        forward("/Pages/comando2.jsp");
    }
    
}