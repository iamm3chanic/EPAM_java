package controller.request;

import controller.Action;
import controller.Forward;
import domain.Request;
import domain.Status;
import service.RequestService;
import service.ServiceException;
import util.FactoryException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestSaveAction extends Action {
    @Override
    public Forward execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Request request = new Request();
        try {
            request.setId(Long.parseLong(req.getParameter("id")));
        } catch(NumberFormatException e) {
            //TODO //////////////////////////////////////////////////////////;
            e.printStackTrace();
            System.out.println("\nERROR\n");
        }
        request.setDescription(req.getParameter("description"));
        /*try {
            request.setDriverId(Long.parseLong(req.getParameter("driverId")));
        } catch(NumberFormatException e) {
            //TODO //////////////////////////////////////////////////////////;
            System.out.println("\nChoose driver for this request\n");
        }*/
        try {
            request.setStatus(Status.values()[Integer.parseInt(req.getParameter("status"))]);
        } catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {}
        if(request.getClientId() != null && request.getStatus() != null) {
            try {
                RequestService service = getServiceFactory().getRequestService();
                service.save(request);
                return new Forward("/request/view.html?id="+request.getId());
            } catch(FactoryException | ServiceException e) {
                throw new ServletException(e);
            }
        }
        return new Forward("/request/list.html");
    }
}
