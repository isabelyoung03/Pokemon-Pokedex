package pokemon;

import pokemon.Pokemon;

public class Sylveon extends Pokemon {
    public Sylveon() {
        super("pokemon.Sylveon", Type.FAIRY);
    }
    public Sylveon(String nickname) {

        super("pokemon.Sylveon", Type.FAIRY, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Moonblast!");
    }

}
