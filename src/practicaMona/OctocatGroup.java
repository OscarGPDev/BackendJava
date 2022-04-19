package practicaMona;

public class OctocatGroup extends Octocat {
    private Octocat[] octocats;

    public OctocatGroup(String name, String description, String imageLink, boolean singleOctocat, Octocat[] octocats) {
        this.setName(name);
        this.setDescription(description);
        this.setImageLink(imageLink);
        this.setSingleOctocat(singleOctocat);
        this.octocats = octocats;
    }


    public Octocat[] getOctocats() {
        return octocats;
    }

    public void setOctocats(Octocat[] octocats) {
        this.octocats = octocats;
    }

    public String fullData() {
        StringBuilder buddiesData = new StringBuilder();
        for (Octocat octocatBuddie : octocats) {
            buddiesData.append(octocatBuddie.fullData());
        }
        return "Name: " + this.getName() + "\n" +
                "Description: " + this.getDescription() + "\n" +
                "Image: " + this.getImageLink() + "\n" +
                "Has buddies: " + (this.isSingleOctocat() ? "no" : "yes")+"\n"+
                "Buddies data: "+ buddiesData;
    }
}
