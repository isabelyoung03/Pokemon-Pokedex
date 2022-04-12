public class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", Type.ELECTRIC);
    }
    public Pikachu(String nickname) {
        super("Pikachu", Type.ELECTRIC, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Thunder Shock!");
    }
}
