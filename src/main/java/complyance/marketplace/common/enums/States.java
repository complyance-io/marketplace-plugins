package complyance.marketplace.common.enums;

public enum States {
    JOHOR("01"),
    KEDAH("02"),
    KELANTAN("03"),
    MELAKA("04"),
    NEGERI_SEMBILAN("05"),
    PAHANG("06"),
    PULAU_PINANG("07"),
    PERAK("08"),
    PERLIS("09"),
    SELANGOR("10"),
    TERENGGANU("11"),
    SABAH("12"),
    SARAWAK("13"),
    WILAYAH_PERSEKUTUAN_KUALA_LUMPUR("14"),
    WILAYAH_PERSEKUTUAN_LABUAN("15"),
    WILAYAH_PERSEKUTUAN_PUTRAJAYA("16"),
    OTHERS("17"),
    INVALID("00");

    private final String code;

    States(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
    public static States fromCode(String code) {
        for (States state : values()) {
            if (state.code.equals(code)) {
                return state;
            }
        }
        return INVALID;
    }

}



