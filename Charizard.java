public class Charizard extends Pokemon {
    public Charizard() {
        super("Charizard", Type.FIRE);
    }
    public Charizard(String nickname) {

        super("Charizard", Type.FIRE, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Fire Blast!");
    }
}
