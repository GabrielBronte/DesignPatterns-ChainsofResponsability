import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FightDocumentTest {
    EmployeeFighter fighter;
    EmployeeReferee judge;
    EmployeeDoctor doctor;

    @BeforeEach
    void setUp() {
        judge = new EmployeeReferee(null);
        doctor = new EmployeeDoctor(judge);
        fighter = new EmployeeFighter(doctor);
    }

    @Test
    void deveRetornarVitoriapNocauteSubmissão() {
        assertEquals("Vitória por nocaute/submissão",
                fighter.generateResultoftheFight(new FightDocument(FightResultFinishes.getFightResultFinishes())));
    }

    @Test
    void deveRetornarDecisaoInterrupcaoMedica() {
        assertEquals("Decisão por interrupção médica",
                fighter.generateResultoftheFight(new FightDocument(FightResultMedicalInterruption.getFightResultMedicalInterruption())));
    }

    @Test
    void deveRetornarDecisaoInterrupcaoArbitro() {
        assertEquals("Decisão por interrupção do arbitro",
                judge.generateResultoftheFight(new FightDocument(FightResultRefereeDecision.getFightResultDecisionPoints())));
    }
    @Test
    void deveRetornarDecisaoPontos() {
        assertEquals("Decisão dos juízes por pontos",
                fighter.generateResultoftheFight(new FightDocument(FightResultJudgeDecision.getFightResultJudgeDecision())));
    }

}

/*
    Soldado soldado;
    Espadachim espadachim;
    General general;
    Heroi heroi;

    @BeforeEach
    void setUp() {
        heroi = new Heroi(null);
        general = new General(heroi);
        espadachim = new Espadachim(general);
        soldado = new Soldado(espadachim);
    }

    @Test
    void deveRetornarSoldadoParaUsarGolpeFraco() {
        assertEquals("Golpe de Soldado do exército", soldado.usarHabilidade(new Habilidade(TipoHabilidadeFraca.getTipoHabilidadeFraca())));
    }

    @Test
    void deveRetornarEspadachimParaUsarGolpeMedio() {
        assertEquals("Golpe de Espadachim Habilidoso", soldado.usarHabilidade(new Habilidade(TipoHabilidadeNormal.getTipoHabilidadeNormal())));
    }

    @Test
    void deveRetornarGeneralParaUsarGolpeForte() {
        assertEquals("Golpe de um  General do exército", soldado.usarHabilidade(new Habilidade(TipoHabilidadeForte.getTipoHabilidadeForte())));
    }

    @Test
    void deveRetornarHeroiUsarGolpePoderoso() {
        assertEquals("Golpe do Guerreiro mais poderoso da nação", soldado.usarHabilidade(new Habilidade(TipoHabilidadePoderosa.getTipoHabilidadePoderosa())));
    }

    @Test
    void deveRetornarNenhumHeroiParaGolpeAereo() {
        assertEquals("Sem Classe para usar Golpe", soldado.usarHabilidade(new Habilidade(TipoHabilidadeAerea.getTipoHabilidadeAerea())));
    }
 */