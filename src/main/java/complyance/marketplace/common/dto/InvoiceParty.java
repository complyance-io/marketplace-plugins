package complyance.marketplace.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceParty {
    private String industryCode;
    private String industryDescription;
    private String organizationName;
    private String phoneNumber;
    private String email;
}
