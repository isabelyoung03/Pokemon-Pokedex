import java.util.Random;

abstract public class Pokemon {
    private String name;
    private Type type;
    private String nickname;

    enum Type { //pokemon types
        NORMAL,
        FIRE,
        WATER,
        GRASS,
        ELECTRIC,
        ICE,
        FIGHTING,
        POISON,
        GROUND,
        FLYING,
        PSYCHIC,
        BUG,
        ROCK,
        GHOST,
        DARK,
        DRAGON,
        STEEL,
        FAIRY;
    }
    public Pokemon() {}
    public Pokemon(String name, Type type, String nickname) {
        this.name = name;
        this.type = type;
        this.nickname = nickname;
    }
    public Pokemon(String name, Type type) { //constructor for when pokemon isn't given nickname
        this.name = name;
        this.type = type;
        this.nickname = name; //nickname is set to the pokemon name
    }
    public String getNickname() { return this.nickname; }
    public void setNickname(String nickname) { this.nickname = nickname;}
    public void interact() {
        Random random = new Random(4);
        switch (random.nextInt()) {
            case 0:
                System.out.println(nickname + " is having fun swaying back and forth.");
                break;
            case 1:
                System.out.println(nickname + " is very happy!");
                break;
            case 2:
                System.out.println(nickname + " looks tired.");
                break;
            case 3:
                System.out.println(nickname + " is excited to be with you!");
                break;
        }
    }
    public abstract void attack();
}
