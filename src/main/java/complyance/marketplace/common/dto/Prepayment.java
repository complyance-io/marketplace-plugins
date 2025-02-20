package complyance.marketplace.common.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Prepayment {
    private String referenceId;

    private BigDecimal paidAmount;

    private String paidDate;

    private String paidTime;
}
