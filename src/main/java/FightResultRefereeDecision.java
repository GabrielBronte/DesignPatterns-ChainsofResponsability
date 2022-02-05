public class FightResultRefereeDecision implements FightResult{
    private static FightResultRefereeDecision fightResultDecisionPoints = new FightResultRefereeDecision();
    private FightResultRefereeDecision(){};

    public  static FightResultRefereeDecision getFightResultDecisionPoints(){
        return fightResultDecisionPoints;
    }
}
