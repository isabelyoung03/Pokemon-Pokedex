public class Pikachu extends Pokemon {
    public Pikachu(String nickname) {
        super("Pikachu", Type.WATER, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Thunder Shock!");
    }
}
