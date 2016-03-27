
/**
 *
 * @author Douglas
 */
public enum Res {
    LOVE("Love"), FIFTEEN("Fifteen"), THIRTY("Thirty"), FORTY("Forty"), EMPTY("");

    private final String description;

    private Res(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
