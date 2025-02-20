package complyance.marketplace.common.enums;

public enum DocumentType {
    INV("01"),
    CRD("02"),
    DBT("03"),
    RFD("04"),
    SLF_INV("11"),
    SLF_CRD("12"),
    SLF_DBT("13"),
    SLF_REF("14"),
    INCORRECT("00");

    private final String code;

    private DocumentType(String code) {
        this.code = code;
    }

    // Overloaded constructor for types without a specific code
    private DocumentType() {
        this.code = null;
    }

    public String getCode() {
        return this.code;
    }

    public static DocumentType fromUserInput(String userInput) {
        for (DocumentType type : values()) {
            if (type.name().equalsIgnoreCase(userInput.replace("_", ""))) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown document type: " + userInput);
    }
}

