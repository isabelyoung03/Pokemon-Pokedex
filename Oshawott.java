public class Oshawott extends Pokemon {
    public Oshawott(String nickname) {
        super("Oshawott", Type.WATER, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Aqua Tail!");
    }
}
