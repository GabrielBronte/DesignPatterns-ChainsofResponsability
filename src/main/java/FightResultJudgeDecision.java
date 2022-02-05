public class FightResultJudgeDecision implements FightResult{
    private static FightResultJudgeDecision fightResultDecisionPoints = new FightResultJudgeDecision();
    private FightResultJudgeDecision(){};

    public  static FightResultJudgeDecision getFightResultJudgeDecision(){
        return fightResultDecisionPoints;
    }
}
