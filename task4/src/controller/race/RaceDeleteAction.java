package controller.race;

import controller.Action;
import controller.Forward;
import service.RaceService;
import service.ServiceException;
import util.FactoryException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RaceDeleteAction extends Action {
    @Override
    public Forward execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Long id = null;
        try {
            id = Long.parseLong(req.getParameter("id"));
        } catch(NumberFormatException e) {}
        if(id != null) {
            try {
                RaceService service = getServiceFactory().getRaceService();
                service.delete(id);
            } catch(FactoryException | ServiceException e) {
                throw new ServletException(e);
            }
        }
        return new Forward("/race/list.html");
    }
}
