public class Morpeko extends Pokemon{
    public Morpeko() {
        super("Morpeko", Type.ELECTRIC);
    }
    public Morpeko(String nickname) {

        super("Morpeko", Type.ELECTRIC, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " Aura Wheel!");
    }
}
