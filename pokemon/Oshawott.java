package pokemon;

import pokemon.Pokemon;

public class Oshawott extends Pokemon {
    public Oshawott() {
        super("pokemon.Oshawott", Type.WATER);
    }
    public Oshawott(String nickname) {
        super("pokemon.Oshawott", Type.WATER, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Aqua Tail!");
    }
}
