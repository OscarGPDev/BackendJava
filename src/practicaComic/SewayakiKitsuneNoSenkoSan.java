package practicaComic;

import imonsh.Screen;

public class SewayakiKitsuneNoSenkoSan extends Comic implements Runnable {
    /**
     * The screen object that allows us to display the comic.
     */
    private Screen screen;

    /**
     * Constructor for an empty SewayakiKitsuneNoSenkoSan, you should provide the Screen object by setter later.
     */

    public SewayakiKitsuneNoSenkoSan() {
        initializePagesData();
    }

    /**
     * Constructor that allows you to provide the required Screen object, it would be used as output for this comic.
     *
     * @param screen Required Screen object.
     */
    public SewayakiKitsuneNoSenkoSan(Screen screen) {
        this.screen = screen;
        initializePagesData();
    }

    /**
     * Set the pages data for this comic
     */
    private void initializePagesData() {
        Page[] pages = new Page[31];
        for (int i = 3; i < 34; i++) {
            pages[i - 3] = new Page("./comic_data/senko-san 01-08-" + String.format("%03d", i) + ".png", 5000);
        }
        this.setPages(pages);
    }

    @Override
    public void run() {
        for (Page page : getPages()) {
            screen.showImage(page.getPage());
            try {
                Thread.sleep(page.getDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            screen.cls();
        }
    }


    /**
     * Setter for the Screen object that would be used as output, use it if you haven't provided in the constructor before.
     *
     * @param screen Screen required object
     */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
