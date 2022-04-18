package practicaHarry;

public class Character {
    private String name;
    private House house;
    private Gender gender;
    private String boggart;
    private String patronus;

    public Character() {

    }

    public Character(String name, House house, Gender gender, String boggart, String patronus) {
        this.name = name;
        this.house = house;
        this.gender = gender;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }
    // I decided to return a string instead of printing directly here because of displaying function could be delegated
    // to his implementation
    public String showData() {

        return "Name: " + this.name + "\n" +
                "House: " + this.house.getHouseName() + "\n" +
                "Gender: " + this.gender.getGenderName() + "\n" +
                "Boggart: " + this.boggart + "\n" +
                "Patronus: " + this.patronus;
    }


}
