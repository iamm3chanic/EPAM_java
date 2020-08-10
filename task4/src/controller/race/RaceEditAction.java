package controller.race;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Action;
import controller.Forward;
import domain.Race;
import service.ServiceException;
import service.RaceService;
import util.FactoryException;

public class RaceEditAction extends Action {
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
                Race race = service.findById(id);
                req.setAttribute("race", race);
            } catch(FactoryException | ServiceException e) {
                throw new ServletException(e);
            }
        }
       // req.setAttribute("models", Model.values());
       // req.setAttribute("conditions", Condition.values());
        return null;
    }
}
