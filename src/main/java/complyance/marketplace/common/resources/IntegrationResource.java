package complyance.marketplace.common.resources;

import complyance.marketplace.common.model.UnifyRequest;
import complyance.marketplace.common.service.IntegrationService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

@Path("/common")
public class IntegrationResource {

    @Inject
    IntegrationService integrationService;

    @POST
    @Path("/receipts")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response integration() {
        try {
            String url = "URL";
            UnifyRequest unifyRequest = new UnifyRequest();
            integrationService.sendToUnify(unifyRequest,url);
            Map<String, String> response = new HashMap<>();
            response.put("status", "Connection successful");
            return Response.ok(response).build();
        } catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("status", "Connection failed");
            errorResponse.put("error", e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                         .entity(errorResponse)
                         .build();
        }
    }
} 