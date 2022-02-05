public class FightDocument {
    private FightResult fightResult;

    public FightDocument(FightResult fightResult) {
        this.fightResult = fightResult;
    }

    public FightResult getFightResult() {
        return fightResult;
    }

    public void setFightResult(FightResult fightResult) {
        this.fightResult = fightResult;
    }
}
