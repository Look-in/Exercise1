package reference;

public enum Expunge {
	VOCABLE("��������"), IRREVOCABLE("�����������");

	private final String displayName;

	private Expunge(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
