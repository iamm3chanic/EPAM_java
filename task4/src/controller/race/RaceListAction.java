package controller.race;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Action;
import controller.Forward;
import domain.Race;
import service.ServiceException;
import service.RaceService;
import util.FactoryException;

public class RaceListAction extends Action {
    @Override
    public Forward execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            RaceService service = getServiceFactory().getRaceService();
            List<Race> races = service.findAll();
            req.setAttribute("races", races);
            return null;
        } catch(FactoryException | ServiceException e) {
            throw new ServletException(e);
        }
    }
}
