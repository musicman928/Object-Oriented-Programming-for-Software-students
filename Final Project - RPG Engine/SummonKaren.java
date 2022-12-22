public class SummonKaren extends Action{

    public SummonKaren(Character owner) {
        super(owner);
    }

    @Override
    public void target(Character target) {
        getOwner().getWorld().addCharacter(CharacterDefinitions.defineKaren(getOwner().getWorld()));
    }

    @Override
    public String getName() {
        return "Summon Karen";
    }
}
