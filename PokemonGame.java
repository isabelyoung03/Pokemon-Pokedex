public class PokemonGame {
    public static void main(String[] args) {
        Oshawott oshawott = new Oshawott("Steve");
        Pikachu pikachu = new Pikachu("PIKACHUUU");
        Scorbunny scorbunny1 = new Scorbunny();
        Scorbunny scorbunny2 = new Scorbunny("bunny");

        oshawott.attack();
        pikachu.attack();

        pikachu.interact();
        pikachu.interact();
        pikachu.interact();
        pikachu.interact();
        scorbunny2.interact();

        scorbunny1.attack();
    }
}
