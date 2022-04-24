package practicaLineUp;

import java.util.ArrayList;
import java.util.Map;

public class Event {
    private Map<String, ArrayList<Show>> shows;

    public Event() {
    }

    public Event(Map<String, ArrayList<Show>> shows) {
        this.shows = shows;
    }


    public Map<String, ArrayList<Show>> getShows() {
        return shows;
    }

    public void setShows(Map<String, ArrayList<Show>> shows) {
        this.shows = shows;
    }
}
