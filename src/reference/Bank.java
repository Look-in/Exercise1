package reference;

public enum Bank {
	BELARUSBANK("Беларусбанк"), BELAPB("Белагропромбанк"), BELINVEST("Белинвестбанк");

	private final String displayName;

	private Bank(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
}
}
