package practicaMona;

public class Octogatos extends OctocatGroup {
    public Octogatos() {
        super("Octogatos",
                "Octogatos, a group of mexican octocats having a meal, because of the papers it looks that it's Día de Muertos.",
                "https://octodex.github.com/images/Octogatos.png",
                false,
                new Octocat[]{
                        new Octocat(
                                "Octogatos",
                                "It's a mariachi octocat with a red suit.",
                                "https://octodex.github.com/images/Octogatos.png",
                                true),
                        new Octocat(
                                "Octogatos",
                                "A female octocat with green mob-cap and a yellow dress.",
                                "https://octodex.github.com/images/Octogatos.png",
                                true),
                        new Octocat(
                                "Octogatos",
                                "An octocat with beard and mustache, black hoodie and blue jeans.",
                                "https://octodex.github.com/images/Octogatos.png",
                                true),
                        new Octocat(
                                "Octogatos",
                                "Another female octocat with brown lips, black hoodie and a red and blue skirt.",
                                "https://octodex.github.com/images/Octogatos.png",
                                true),
                        new Octocat(
                                "Octogatos",
                                "Octocat with white shirt and straw hat holding tacos.",
                                "https://octodex.github.com/images/Octogatos.png",
                                true),
                        new Octocat(
                                "Octogatos",
                                "An female octocat wearing a white and blue dress.",
                                "https://octodex.github.com/images/Octogatos.png",
                                true),
                });
    }

    @Override
    public void action() {
        System.out.println("This octocat group is having a meal");
    }
}
