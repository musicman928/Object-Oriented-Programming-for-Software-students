public class HealthPotion extends Action {
    private int amount = 200;
    HealthPotion(Character owner) {
        super(owner);
    }

    @Override
    public void target(Character target) {
        target.heal(amount);
        System.out.println(target.getName() + " sipped the potion and recovered " + amount + " 2HP, it's like it never runs out!");
        getOwner().setReady(false);
    }

    public String getName() {
        return "Health Potion";
    }
}
