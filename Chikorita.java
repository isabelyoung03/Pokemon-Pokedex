import java.util.Random;

public class Chikorita extends Pokemon{
    public Chikorita() {
        super("Chikorita", Type.GRASS);
    }
    public Chikorita(String nickname) {

        super("Chikorita", Type.GRASS, nickname);
    }
    @Override
    public void attack() {
        System.out.println(this.getNickname() + " used Magical Leaf!");
    }
    @Override
    public void interact() {
        Random random = new Random();
        switch (random.nextInt(2)) {
            case 0:
                System.out.println("Chikorita is waving its leaf around.");
                break;
            case 1:
                System.out.println("Chikorita is very happy!");
                break;

        }
    }
}
