public abstract class Action {
    private Character owner;
    private String name;
    public Action(Character owner) {
        this.owner = owner;
    }
    public Character getOwner() {
        return owner;
    }
    abstract public void target(Character target);

    abstract public String getName();

}
