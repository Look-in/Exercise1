package reference;

public enum AttributeToCompare {
    PERCENT("�������"), PERIOD("������"), PROFIT("����������"), ADJUNCE("����������"),
    EXPUNGE("��������� ������"), BANK("����");

    private final String displayName;

    AttributeToCompare(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
