public class PokemonGame {
    public static void main(String[] args) {
        Oshawott oshawott = new Oshawott("Steve");
        Pikachu pikachu = new Pikachu("Spark");
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

        PokemonParty party = new PokemonParty();
        party.addMember(oshawott);
        party.listParty();
        party.addMember(pikachu);
        party.addMember(scorbunny1);
        party.addMember(scorbunny2);
        party.listParty();
    }
}
