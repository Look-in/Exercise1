package reference;

public enum Bank {
	BELARUSBANK("�����������"), BELAPB("���������������"), BELINVEST("�������������");

	private final String displayName;

	private Bank(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
}
}
