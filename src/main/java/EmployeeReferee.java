public class EmployeeReferee extends Employee{
    public EmployeeReferee(Employee upper){
        results.add(FightResultRefereeDecision.getFightResultDecisionPoints());
        setSeniorOfficial(upper);
    }

    public String getFightResult() {
        return "Decisão por interrupção do arbitro";
    }
}
