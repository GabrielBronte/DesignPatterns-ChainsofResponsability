import java.util.ArrayList;

public abstract class Employee {
    protected ArrayList results = new ArrayList();
    private Employee seniorOfficial;

    public Employee getSeniorOfficial() {
        return seniorOfficial;
    }

    public void setSeniorOfficial(Employee seniorOfficial) {
        this.seniorOfficial = seniorOfficial;
    }

    public abstract String getFightResult();

    public String generateResultoftheFight(FightDocument fightDocument) {
        if (results.contains(fightDocument.getFightResult())) {
            return getFightResult();
        }
        else {
            if (seniorOfficial != null) {
                return seniorOfficial.generateResultoftheFight(fightDocument);
            }
            else
            {
                return "Decisão dos juízes por pontos";
            }
        }
    }

}
