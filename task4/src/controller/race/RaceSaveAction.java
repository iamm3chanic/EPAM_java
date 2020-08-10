package controller.race;

import controller.Action;
import controller.Forward;
import domain.Race;
import service.RaceService;
import service.ServiceException;
import util.FactoryException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

import static javax.xml.bind.DatatypeConverter.parseString;

public class RaceSaveAction extends Action {
    @Override
    public Forward execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Race race = new Race();
        try {
            race.setId(Long.parseLong(req.getParameter("id")));
        } catch(NumberFormatException e) {
            e.printStackTrace();
            System.out.println("\nERROR\n");
        }
        try {
            //race.setModel(Model.values()[Integer.parseInt(req.getParameter("model"))]);
            race.setHorses(Byte.parseByte(req.getParameter("horses")));
            race.setDate(Date.from(Instant.parse(req.getParameter("date"))));
            race.setPlace(parseString(req.getParameter("place")));
 //           race.setCondition(Condition.values()[Integer.parseInt(req.getParameter("condition"))]);
        } catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {}
        if(race.getPlace() != null && race.getDate() != null) {
            try {
                RaceService service = getServiceFactory().getRaceService();
                service.save(race);
            } catch(FactoryException | ServiceException e) {
                throw new ServletException(e);
            }
        }
        return new Forward("/race/list.html");
    }
}
