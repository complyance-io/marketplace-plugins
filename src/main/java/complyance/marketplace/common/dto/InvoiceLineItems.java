package complyance.marketplace.common.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class InvoiceLineItems {

    private String lineItemId;
    private String description;
    private BigDecimal unitPrice = BigDecimal.ZERO;
    private BigDecimal quantity;
    private BigDecimal lineTotalExcludingTax;
    private BigDecimal totalTax;
    private BigDecimal discountAmount = BigDecimal.ZERO;
    private BigDecimal discountPercent = BigDecimal.ZERO;
    private BigDecimal chargePercent = BigDecimal.ZERO;
    private BigDecimal chargeAmount = BigDecimal.ZERO;
    private BigDecimal lineItemSubtotal;
    private BigDecimal taxPercentage;
    private String taxExemptionReason;
    private String taxType;
    private String taxCode;
    private String commodityClassificationCode;
    private String productTariffCode;
    private BigDecimal amountExemptedFromTax;
    private BigDecimal lineItemTotal;
    private String lineItemCountryOfOrigin;
    private String lineItemMeasurement;
    
    // Peppol data's
    private String lineId;
    private String lineNote;
    private String linePOReference;
    private String lineSupplyStartDate;
    private String lineSupplyEndDate;
    private HashMap<String, String> lineItemCustomFields;
}
