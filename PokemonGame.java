/**
 * @author Isabel Young
 */

public class PokemonGame {
    public static void main(String[] args) {
        Oshawott oshawott = new Oshawott("Otter Boy");
        Pikachu pikachu = new Pikachu("Spark");
        Scorbunny scorbunny = new Scorbunny();
        Charizard charizard = new Charizard();
        Morpeko morpeko = new Morpeko();
        Mimikyu mimikyu = new Mimikyu("Spook");
        Chikorita chikorita = new Chikorita("Leafy Greens");

        oshawott.attack();
        pikachu.attack();
        morpeko.attack();

        pikachu.interact();
        pikachu.interact();
        pikachu.interact();
        pikachu.interact();

        PokemonParty party = new PokemonParty();
        party.addMember(chikorita);
        party.addMember(oshawott);
        party.addMember(pikachu);
        party.addMember(morpeko);
        party.addMember(mimikyu);
        party.addMember(scorbunny);
        party.listParty();

        party.removeMember(scorbunny);
        party.listParty();

        party.addMember(charizard);
        party.listParty();

        party.getCurrent().interact();

        mimikyu.eatBerry(Berry.ORAN);

        morpeko.eatBerry(Berry.PECHA);
    }
}
