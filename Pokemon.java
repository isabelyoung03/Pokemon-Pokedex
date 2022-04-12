abstract public class Pokemon {
    private String name;
    private Type type;
    private String nickname;

    enum Type {
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
        FAIRY
    }
    public Pokemon() {}
    public Pokemon(String name, Type type, String nickname) {
        this.name = name;
        this.type = type;
        this.nickname = nickname;
    }
    public Pokemon(String name, Type type) {
        this.name = name;
        this.type = type;
        this.nickname = name;
    }
    public String getNickname() { return this.nickname; }
    public void setNickname(String nickname) { this.nickname = nickname;}
    public abstract void attack();
}
