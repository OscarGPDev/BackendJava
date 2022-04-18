package practicaHarry;

public enum House {
    GRYFFINDOR("Gryffindor", "Godric Gryffindor"),
    HUFFLEPUFF("Hufflepuff", "Helga Hufflepuff"),
    RAVENCLAW("Ravenclaw", "Rowena Ravenclaw"),
    SLYTHERIN("Slytherin", "Salazar Slytherin");
    private final String houseName;
    private final String houseFounder;


    House(String houseName, String houseFounder) {
        this.houseName = houseName;
        this.houseFounder = houseFounder;
    }


    public String getHouseName() {
        return houseName;
    }

    public String getFounderName() {
        return houseFounder;
    }
}
