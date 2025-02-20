package complyance.marketplace.plugins.cloudbeds.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/plugins/cloudbeds")
public class CloudbedsResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String status() {
        return "Cloudbeds Plugin Active";
    }
} 