package practicaMultiverse;

public abstract class SpiderMan {
    private String realName;
    private String spiderName;
    private String earthName;

    public SpiderMan() {
    }

    public SpiderMan(String realName, String spiderName, String earthName) {
        this.spiderName = spiderName;
        this.realName = realName;
        this.earthName = earthName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSpiderName() {
        return spiderName;
    }

    public void setSpiderName(String spiderName) {
        this.spiderName = spiderName;
    }

    public String getEarthName() {
        return earthName;
    }

    public void setEarthName(String earthName) {
        this.earthName = earthName;
    }

    public String spiderData() {
        return "Spider Name: " + spiderName + "\n" +
                "Real Name: " + realName + "\n" +
                "Earth: " + earthName;
    }
}
