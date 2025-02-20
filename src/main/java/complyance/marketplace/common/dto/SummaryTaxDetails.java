package complyance.marketplace.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SummaryTaxDetails {

    private BigDecimal taxableAmount;

    private BigDecimal taxAmount;
    
    private String taxType;
    
    private String taxExemptionReason;
    
    private String percent;
    
    private String taxCode;
}
