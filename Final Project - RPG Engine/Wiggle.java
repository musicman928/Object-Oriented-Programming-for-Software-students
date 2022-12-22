public class Wiggle extends Action {


    public Wiggle(Character owner) {
        super(owner);
    }

    @Override
    public void target(Character target) {
        System.out.printf("The %s peacefully wriggled and crawled across the sidewalk with no way of possibly knowing it has run out of time.\n",getOwner().getName());
        getOwner().setReady(false);
    }

    @Override
    public String getName() {
        return "Wiggle";
    }

}
