package pokemon;

public class Scorbunny extends Pokemon {
    public Scorbunny() {
        super("pokemon.Scorbunny", Type.FIRE);
    }
    public Scorbunny(String nickname) {

        super("pokemon.Scorbunny", Type.FIRE, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Flame Charge!");
    }
}
