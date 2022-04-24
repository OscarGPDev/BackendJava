package practicaComic;


/**
 * An abstract class with the elements for a comic
 */
public abstract class Comic {
    /**
     * Pages of this comic.
     */
    private Page[] pages;

    /**
     * Constructor for an empty comic, you should fill it later with the provided setters.
     */
    public Comic() {
    }

    /**
     * Constructor for a comic, that allows you to add his data.
     *
     * @param pages Pages[]: pages of this comic.
     */
    public Comic(Page[] pages) {
        this.pages = pages;
    }

    /**
     * @return Pages[], the array of pages of this comic.
     */
    public Page[] getPages() {
        return pages;
    }

    /**
     * @param pages Pages[] the required pages for this comic.
     */
    public void setPages(Page[] pages) {
        this.pages = pages;
    }
}

