package reference;

public enum AttributeToCompare {
    PERCENT("Процент"), PERIOD("Период"), PROFIT("Доходность"), ADJUNCE("Пополнение"),
    EXPUNGE("Досрочное снятие"), BANK("Банк");

    private final String displayName;

    AttributeToCompare(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
