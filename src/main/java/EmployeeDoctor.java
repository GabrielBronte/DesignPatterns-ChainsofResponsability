public class EmployeeDoctor extends Employee{
    public EmployeeDoctor(Employee upper){
        results.add(FightResultMedicalInterruption.getFightResultMedicalInterruption());
        setSeniorOfficial(upper);
    }

    public String getFightResult() {
        return "Decisão por interrupção médica";
    }
}
