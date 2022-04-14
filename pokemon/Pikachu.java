package pokemon;

import pokemon.Pokemon;

public class Pikachu extends Pokemon {
    public Pikachu() {
        super("pokemon.Pikachu", Type.ELECTRIC);
    }
    public Pikachu(String nickname) {

        super("pokemon.Pikachu", Type.ELECTRIC, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Thunder Shock!");
    }
}
