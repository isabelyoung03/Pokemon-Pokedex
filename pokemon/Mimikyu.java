package pokemon;

import pokemon.Pokemon;

public class Mimikyu extends Pokemon {
    public Mimikyu() {
        super("pokemon.Mimikyu", Type.GHOST);
    }
    public Mimikyu(String nickname) {

        super("pokemon.Mimikyu", Type.GHOST, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " Shadow Claw!");
    }
}
