package practicaMona;

public class Octocat {
    private String name;
    private String description;
    private String imageLink;
    private boolean singleOctocat;

    public Octocat() {
    }

    public Octocat(String name, String description, String imageLink, boolean singleOctocat) {
        this.name = name;
        this.description = description;
        this.imageLink = imageLink;
        this.singleOctocat = singleOctocat;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public boolean isSingleOctocat() {
        return singleOctocat;
    }

    public void setSingleOctocat(boolean singleOctocat) {
        this.singleOctocat = singleOctocat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action() {
    }

    public String fullData() {
        return "Name: " + this.name + "\n" +
                "Description: " + this.description + "\n" +
                "Image: " + this.imageLink + "\n" +
                "Has buddies: " + (this.singleOctocat ? "no" : "yes");
    }
}
