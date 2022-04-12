public class Mimikyu extends Pokemon{
    public Mimikyu() {
        super("Mimikyu", Type.GHOST);
    }
    public Mimikyu(String nickname) {

        super("Mimikyu", Type.GHOST, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " Shadow Claw!");
    }
}
