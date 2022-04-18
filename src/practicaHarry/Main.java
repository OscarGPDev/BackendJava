package practicaHarry;


public class Main {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        /*
        As houses and genders are limited and defined, I considered that using enums would be nicer :)
        * */
        characters[0] = new Character("Harry James Potter", House.GRYFFINDOR, Gender.MALE, "Dementor", "Stag ");
        characters[1] = new Character("Hermione Jean Granger", House.GRYFFINDOR, Gender.FEMALE, "Failure", "Otter");
        characters[2] = new Character("Ronald Bilius Weasley", House.GRYFFINDOR, Gender.MALE, "Aragog", "Jack Russell Terrier");
        characters[3] = new Character("Severus Snape", House.SLYTHERIN, Gender.MALE, "Lord Voldemort", "Doe");
        characters[4] = new Character("Cedric Diggory", House.HUFFLEPUFF, Gender.MALE, "Lord Voldemort", "Unknown");
        for (Character character :
                characters) {
            System.out.println(character.showData());
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        }
    }
}
