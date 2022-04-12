public class PokemonParty {
    private Pokemon[] partyPokemon;
    private int current;
    private int totalPokemon;
    public PokemonParty() {
        partyPokemon = new Pokemon[6];
        totalPokemon = 0;
    }
    public Pokemon getCurrent() {
        return partyPokemon[0];
    }
    public void addMember(Pokemon p) {
        if (totalPokemon < 6){
            partyPokemon[totalPokemon] = p;
            totalPokemon++;
            System.out.println(p.getNickname() + " has been added to your party!");
        }
        else {
            System.out.println("Your party is already full!");
        }
    }
    public void listParty() {
        System.out.println("++++ Your Pokemon party: ++++");
        for (int i = 0; i < 6; i++) {
            if (i < totalPokemon) {
                Pokemon p = partyPokemon[i];
                if (p.getNickname().equals(p.getName())) {
                    System.out.printf("%s. %s \n", i+1, p.getName());
                }
                else { System.out.printf("%s. %s (%s) \n", i+1, p.getNickname(), p.getName()); }
            }
            else {
                System.out.println(i+1 + ". Empty");
            }
        }
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
