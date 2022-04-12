public class Scorbunny extends Pokemon {
    public Scorbunny() {
        super("Scorbunny", Type.FIRE, null);
    }
    public Scorbunny(String nickname) {
        super("Scorbunny", Type.FIRE, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Flame Charge!");
    }
}
