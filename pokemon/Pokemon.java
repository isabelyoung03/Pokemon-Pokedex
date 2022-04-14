package pokemon;

import items.Berry;

import java.util.Random;

abstract public class Pokemon {
    private String name;
    private Type type;
    private String nickname;
    private final int maxHealth = 100;
    private int health;
    private boolean fainted;

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
        public String toString() {
            return this.name().substring(0, 1).toUpperCase() + this.name().substring(1);
        }
    }
    public Pokemon() {}
    public Pokemon(String name, Type type, String nickname) {
        this.name = name;
        this.type = type;
        this.nickname = nickname;
        this.health = this.maxHealth;
        this.fainted = false;
    }
    public Pokemon(String name, Type type) { //constructor for when pokemon isn't given nickname
        this.name = name;
        this.type = type;
        this.nickname = name; //nickname is set to the pokemon name
        this.health = 100;
        this.fainted = false;
    }
    public String getName() { return this.name; }
    public String getNickname() { return this.nickname; }
    public int getHealth() { return this.health; }
    public Type getType() { return this.type; }
    public void interact() {
        Random random = new Random();
        switch (random.nextInt(5)) {
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
            case 4:
                System.out.println(nickname + " is feeling shy.");
                break;
        }
    }
    public void takeDamage() {
        Random random = new Random();
        switch (random.nextInt(5)) {
            case 0:
                health -= 10;
                System.out.println("Weak attack!");
                break;
            case 1:
                health -= 30;
                System.out.println("Strong attack!");
            default:
                health -= 20;
        };
        if (health <= 0) {
            health = 0;
            fainted = true;
            System.out.println(this.nickname + " has fainted!");
        }
        System.out.printf("Your pokemon.Pokemon's health is now %s/%s \n", this.health, this.maxHealth);
    }
    public void eatBerry(Berry berry) {
        health += 20;
        if (health > 100) { health = 100; }
        System.out.printf("%s ate %s items.Berry. Health is now %s/%s \n", this.nickname, berry.toString(), this.health, this.maxHealth);
    }
    public void heal() {
        health = maxHealth;
        System.out.println(this.nickname + " has been fully healed!");
    }
    public abstract void attack();
}
