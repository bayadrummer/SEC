package bzh.fucktheduck.sec.servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class SecRESTService {

    /**
     * interface de génération du statut de l'application
     *
     * @return
     */
    @GET
    @Path("/status")
    public Response getStatus() {
        System.out.println("WESH GROS");
        return Response.status(200).build();
    }

}
