public class EmptyAction extends Action {

    public EmptyAction(Character owner) {
        super(owner);
    }

    @Override
    public void target(Character target) {}

    @Override
    public String getName() {
        return null;
    }
}
