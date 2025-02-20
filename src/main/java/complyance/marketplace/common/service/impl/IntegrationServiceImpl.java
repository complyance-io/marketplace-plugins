package complyance.marketplace.common.service.impl;

import complyance.marketplace.common.exception.PluginException;
import complyance.marketplace.common.model.UnifyRequest;
import complyance.marketplace.common.service.IntegrationService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class IntegrationServiceImpl implements IntegrationService {


    @Override
    public void sendToUnify(UnifyRequest unifyRequest, String url) {
        Client client = null;
        try {
            log.info("Sending request to Unify endpoint for:{}", url);
            client = ClientBuilder.newClient();

            Response response = client
                .target(url)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(unifyRequest, MediaType.APPLICATION_JSON));

            log.info("Successfully sent data to Unify service");

        } catch (Exception e) {
            log.error("Error while sending data to Unify", e);
            throw new PluginException("Error while sending data to Unify", e);
        } finally {
            if (client != null) {
                log.debug("Closing client connection");
                client.close();
            }
        }
    }
}
