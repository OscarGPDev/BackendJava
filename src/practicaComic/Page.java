package practicaComic;

/**
 * Class that would help with the required data to show a page.
 */
public class Page {
    /**
     * Path to the image that would be displayed.
     */
    private String page;
    /**
     * Duration in milliseconds that this page.
     */
    private int duration;

    /**
     * Constructor for an empty page, you should fill the data by setters.
     */
    public Page() {
    }

    /**
     * Constructor for a page with his required data.
     */
    public Page(String page, int duration) {
        this.page = page;
        this.duration = duration;
    }

    /**
     * @return String: Path for the image that would be displayed.
     */
    public String getPage() {
        return page;
    }

    /**
     * @param page String: Path for the image that would be displayed.
     */
    public void setPage(String page) {
        this.page = page;
    }

    /**
     * @return int: Duration in milliseconds that the image would be displayed.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration int: Duration in milliseconds that the image would be displayed.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
