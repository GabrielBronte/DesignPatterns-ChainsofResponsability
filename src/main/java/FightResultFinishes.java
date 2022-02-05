public class FightResultFinishes implements FightResult{
    private static FightResultFinishes fightResultFinishes = new FightResultFinishes();
    private FightResultFinishes(){};

    public  static FightResultFinishes getFightResultFinishes(){
        return fightResultFinishes;
    }
}
