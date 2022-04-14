package items;

public enum Berry {
    CHERI,
    PECHA,
    ORAN,
    RAZZ;
    public String toString() {
        String name = this.name().substring(0, 1).toUpperCase() + this.name().substring(1);
        if (this == ORAN) {
            return "an Oran";
        }
        else {
            return "a " + name;
        }
    }
}
