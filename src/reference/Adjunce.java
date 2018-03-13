package reference;

public enum Adjunce {
	ADJUNCTIVE("Пополнение"), NONADJUNCTIVE("Без пополнения");

	private final String displayName;

	private Adjunce(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
}
}
