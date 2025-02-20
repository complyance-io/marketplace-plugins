package complyance.marketplace.common.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import complyance.marketplace.common.dto.*;
import complyance.marketplace.common.enums.DocumentType;
import complyance.marketplace.common.enums.InvoiceFrequency;
import complyance.marketplace.common.enums.RegistrationIdType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class InvoiceData {
    
    private String clientId;


    private String documentUlid;

    private String documentId;

    private String recieptNumber;

    
    private String originalEInvoiceReferenceNumber;

    private boolean isShipmentAndBuyerAddressSame;

    private Boolean isMailSent = false;

    private Boolean isConsolidate;

    
    private String originalEInvoiceReferenceUUID;

    // @NotNull(message = "documentIssueDate cannot be empty")
    private String documentIssueDate;

    // @NotNull(message = "documentIssueTime cannot be empty")
    private String documentIssueTime;

    // @NotNull(message = "documentType cannot be empty")
    private DocumentType documentType;

    // @NotNull(message = "currency cannot be empty")
    
    private String currency;

    // @NotNull(message = "invoiceStartDate cannot be empty")
    private String invoiceStartDate;

    // @NotNull(message = "invoiceEndDate cannot be empty")
    private String invoiceEndDate;

    // @NotNull(message = "invoiceFrequency cannot be empty")
    private InvoiceFrequency invoiceFrequency;

    // @NotNull(message = "sellerTinNumber cannot be empty")
    
    private String sellerTinNumber;

    // @NotNull(message = "sellerRegistrationIdType cannot be empty")
    private RegistrationIdType sellerRegistrationIdType;

    // @NotNull(message = "sellerRegistrationId cannot be empty")
    private String sellerRegistrationId;

    // @NotNull(message = "buyerTinNumber cannot be empty")
    
    private String buyerTinNumber;

    // @NotNull(message = "buyerRegistrationIdType cannot be empty")
    private RegistrationIdType buyerRegistrationIdType;

    // @NotNull(message = "buyerRegistrationId cannot be empty")
    private String buyerRegistrationId;

    
    private String supplierName;
    // @NotNull(message = "supplierDetails cannot be empty")
    private InvoiceParty supplierDetails;

    
    private String buyerName;
    // @NotNull(message = "buyerDetails cannot be empty")
    private InvoiceParty buyerDetails;

    // @NotNull(message = "buyerAddress cannot be empty")
    private InvoicePartyAddress buyerAddress;

    // @NotNull(message = "sellerAddress cannot be empty")
    private Boolean isEmailSent = false;


    //@NotNull(message = "sellerAddress cannot be empty")
    private InvoicePartyAddress sellerAddress;

    // @NotNull(message = "documentLineItems cannot be empty")
    private List<InvoiceLineItems> documentLineItems;

    // @NotNull(message = "usedTaxTypes cannot be empty")
    private List<SummaryTaxDetails> usedTaxTypes;

    
    private String supplierSstRegistrationNumber;

    private String submittedTime;

    private String validationTime;
  //will implement later for cancell&rejectDocument
    private LocalDateTime cancellationTime;
    private LocalDateTime rejectionTime;

    
    private String buyerSstRegistrationNumber;

    
    private String supplierTourismTaxRegistrationNumber;

    
    private BigDecimal totalExcludingTax;

    
    private BigDecimal totalTaxableAmount;

    
    private BigDecimal totalTaxAmount;

    
    private BigDecimal currencyExchangeRate;

    
    private String taxAccountingCurrency;

    
    private BigDecimal discountOnDocumentTotal = BigDecimal.ZERO;

    private Prepayment prepayment;

    
    private BigDecimal roundingAmount;


    
    private BigDecimal invoiceAdditionalDiscountAmount;

    
    private String invoiceTaxExemptionReason;

    
    private BigDecimal invoiceAdditionalChargeAmount = BigDecimal.ZERO;

    
    private String detailsOfOtherCharges;

    
    private BigDecimal discountPercentage;

    
    private String invoiceMethod;

    
    private BigDecimal taxTotal;

    
    private BigDecimal documentTotal;

    
    private String billReferenceNumber;

    private String pdfTemplates;

    private List<String> receipts;

    @JsonProperty("isShippingAndBuyerAddressSame")
    private boolean isShippingAndBuyerAddressSame = false;
    private RegistrationIdType shippingRecipientRegistrationType;
    private String shippingRecipientRegistrationNumber;
    
    private String shippingRecipientLocationId;
    
    private String shippingRecipientTin;
    
    private String shippingRecipientName;
    private InvoicePartyAddress shippingRecipientAddress;
    
    private String deliveryDate;
    private InvoiceParty shipmentDetails;

    private boolean isSellerInvRepresenting;
    
    private String sellerInvRepName;
    
    private String sellerRepTaxId;
    
    private String sellerRepTaxIdType;
    private InvoicePartyAddress sellerInvRepAddress;

    private boolean isPayeePresent;
    
    private String payeeTaxSchemeID;
    
    private String payeeName;
    
    private String payeeTaxRegistrationNumber;
    
    private String payeeAdditionalRegistrationType;
    
    private String payeeAdditionalRegistrationNumber;
    
    private String paymentId;
    
    private String supplierBankAccountNumber;
    
    private String payeeBankAccountBranch;
    
    private String documentUuid;

    // Export
    private Boolean isExport;
    
    private String customReferenceNumber1;
    
    private String incoTerms;
    
    private String freeTradeAgreement;
    
    private String authorizationNumber;
    
    private String chargesDescription;
    
    private String customReferenceNumber2;

    
    private BigDecimal shippingCharges;

    
    // Ui added fields
     private BigDecimal invoiceAmountExemptedFromTax;

    private Error error;

    // 
    private String taxType;

    
    private BigDecimal totalPayableAmount;

    
    private BigDecimal prePaymentAmount = BigDecimal.ZERO;

    
    private String submissionId;
    
    private String paymentMeans;
    
    private String paymentTerms;
    
    private String keyName;
    
    private String batchId;
    
    private String longId;
    
    private String documentStatus;
    private String cancellationReason;
    
    private String branchName;
    
    private String fileName;
    
    private String buyerId;

    private String peppolStatus;
    // peppol Data's
    
    private String shipmentReason;
    
    private String shipmentId;
    
    private String supplierId;
    
    private String supplierTradingName;
    
    private String sellerPointOfContact;
    
    private String buyerParticipantId;
    
    private String supplierParticipantId;
    
    private String buyerPointOfContact;
    
    private String lhdnDocumentUlid;
    
    private String validationDateTime;
    
    private String validationLink;
    
    private String previousInvoiceIssueDate;
    
    private String previousInvoiceReference;
    private Map<String, String> documentValidationErrors;
    private HashMap<String, String> customFields;
    // peppolcustomfileds
    // References
    
    private String projectReference;
    
    private String salesOrderReference;
    
    private String documentIdentifier;
    
    private String receivingAdviceReference;
    
    private String dispatchAdviceReference;
    
    private String tenderOrLotReference;
    
    private String originatorDocumentReference;
    
    private String contractDocumentReference;
    
    private String invoiceNote;
    
    private String buyerAccountingLedgerReference;

    // Additional Supporting Documents
    // private List<AdditionalSupportingDocument> additionalSupportingDocuments;
    
    private String supportingDocumentReference;
    
    private String supportingDocumentDescription;
    
    private String externalDocumentLocation;
    
    private String attachedDocumentFileName;
    
    private String attachedDocumentMimeCode;

    public InvoiceData() {
        setCustomFields(customFields); // Sanitize during object creation
    }

}