package practicaMultiverse;

import imonsh.Screen;

public interface ISpiderManNoir {
    String[] powers = new String[]{
            "Force",
            "Speed",
            "Agility",
            "Spider-sense",
            "Spider-web(organic)",
            "Cling to sheer walls or other solid surfaces."};
    String[] equipments = new String[]{
            "Kevlar armor, resistant to bullets and explosions",
            "Mask made with the headgear and the aviator glasses used by his uncle during the Great War",
            ".45 caliber pistols",
            "Adept in the use of various firearms such as revolvers and the tommy gun"
    };
    void describeSpiderPowers(Screen s);
    void describeSpiderEquipment(Screen s);


}
