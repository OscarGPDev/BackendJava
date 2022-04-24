package practicaLineUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ImaginaryEvent extends Event implements LineUp {

    public ImaginaryEvent() {

    }

    @Override
    public void programShows(Show[] shows) {
        Map<String, ArrayList<Show>> currentShows = this.getShows();
        if (currentShows==null){
            currentShows = new HashMap<String, ArrayList<Show>>();
        }
        for (Show show : shows) {
            ArrayList<Show> currentSceneShows = currentShows.get(show.getScene());
            if (currentSceneShows != null)
                currentSceneShows.add(show);
            else{
                currentSceneShows = new ArrayList<>();
                currentSceneShows.add(show);
                currentShows.put(show.getScene(), currentSceneShows);
            }
        }
        this.setShows(currentShows);

    }


}
