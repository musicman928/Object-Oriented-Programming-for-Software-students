public class Attack extends Action {
    private String name;
    private int basePower;
    private boolean physical;
    private Action secondaryEffect = new EmptyAction(this.getOwner());

    public Attack(Character owner, String name, int basePower, boolean physical) {
        super(owner);
        this.name = name;
        this.basePower = basePower;
        this.physical = physical;


    }

    public Attack(Character owner, String name, int basePower, boolean physical, Action secondaryEffect) {
        super(owner);
        this.name = name;
        this.basePower = basePower;
        this.physical = physical;
        this.secondaryEffect = secondaryEffect;
    }

    public String getName() {
        return name;
    }

    @Override
    public void target(Character target) {

        int reference = Math.abs(target.getHP());

        target.swing(getOwner(), this);
        int damage = Math.abs(target.getHP() - reference);
        System.out.printf("%s used %s! It did %d damage to %s.\n", getOwner().getName(), getName(), damage, target.getName());
        secondaryEffect.target(target);
        getOwner().setReady(false);

    }

    public boolean isPhysical() {
        return physical;
    }

    public int getBasePower() {
        return basePower;
    }

}
