package complyance.marketplace.common.model;

import lombok.Data;

import java.util.List;

@Data
public class UnifyRequest {
    private List<InvoiceData> invoiceDataList;
    private List<ReceiptsData> receiptDataList;

}
