public class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", Type.ELECTRIC, null);
    }
    public Pikachu(String nickname) {
        super("Pikachu", Type.ELECTRIC, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Thunder Shock!");
    }
}
