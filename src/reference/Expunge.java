package reference;

public enum Expunge {
	VOCABLE("Отзывный"), IRREVOCABLE("Безотзывный");

	private final String displayName;

	private Expunge(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
