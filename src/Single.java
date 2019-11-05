import java.time.LocalDate;
import java.util.Date;

public class Single extends CommunityMem {
    private int LearningYears;

    public Single(int id, String name, String gender, String address, LocalDate birthday, int torahHours, int workHours, int salary, int usedFromGemach, int learningYears) {
        super( id, name, gender, address, birthday, torahHours, workHours, salary, usedFromGemach);
        LearningYears = learningYears;
    }


    public int getLearningYears() {
        return LearningYears;
    }

    public void setLearningYears(int learningYears) {
        LearningYears = learningYears;
    }

    @Override
    public int TaxWage() {
        if (this.LearningYears>5)
        return 0;
        return 20;//percentage
    }

    @Override
    public int MaxGemach() {
        if (this.LearningYears>5)
            return this.LearningYears*10000;
        return 10000;//percentage
    }

    @Override
    public int AvgVolunteer() {
        return 10 - this.getTorahHours();
    }

    @Override
    public String toString() {
        return "Single{" +
                "LearningYears=" + LearningYears +
                '}';
    }
}
