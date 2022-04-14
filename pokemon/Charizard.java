package pokemon;

import pokemon.Pokemon;

public class Charizard extends Pokemon {
    public Charizard() {
        super("pokemon.Charizard", Type.FIRE);
    }
    public Charizard(String nickname) {

        super("pokemon.Charizard", Type.FIRE, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Fire Blast!");
    }
}
