public class WarCry extends Action {
    WarCry(Character owner) {
        super(owner);
    }

    @Override
    public void target(Character target) {
        target.boostAtk(2);
        System.out.printf("%s sounded a war cry and boosted %s's attack!",getOwner().getName(), target.getName());
        getOwner().setReady(false);
    }

    public String getName() {
        return "War Cry";
    }
}
