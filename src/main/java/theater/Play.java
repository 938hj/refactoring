package theater;

/**
 * Represents a play, including its name and type.
 *
 * @author Letian Wang
 */

public class Play {

    private String name;
    private String type;
    /**
     * Creates a play with the given name and type.
     *
     * @param name the name of the play
     * @param type the type of the play
     */

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the name of this play.
     *
     * @return the play name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of this play.
     *
     * @return the play type
     */
    public String getType() {
        return type;
    }
}
