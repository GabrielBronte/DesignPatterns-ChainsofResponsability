public class FightResultMedicalInterruption implements FightResult{
    private static FightResultMedicalInterruption fightResultMedicalInterruption = new FightResultMedicalInterruption();
    private FightResultMedicalInterruption(){};

    public  static FightResultMedicalInterruption getFightResultMedicalInterruption(){
        return fightResultMedicalInterruption;
    }
}
