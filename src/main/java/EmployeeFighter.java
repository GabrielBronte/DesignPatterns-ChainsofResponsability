public class EmployeeFighter extends Employee{
    public EmployeeFighter(Employee upper){
        results.add(FightResultFinishes.getFightResultFinishes());
        setSeniorOfficial(upper);
    }

    public String getFightResult() {
        return "Vitória por nocaute/submissão";
    }
}
