package pokemon;

import pokemon.Pokemon;

public class Morpeko extends Pokemon {
    public Morpeko() {
        super("pokemon.Morpeko", Type.ELECTRIC);
    }
    public Morpeko(String nickname) {

        super("pokemon.Morpeko", Type.ELECTRIC, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " Aura Wheel!");
    }
}
