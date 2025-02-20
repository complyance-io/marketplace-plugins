package complyance.marketplace.common.service;

import complyance.marketplace.common.model.UnifyRequest;

public interface IntegrationService {
    void sendToUnify(UnifyRequest unifyRequest, String url);
}
