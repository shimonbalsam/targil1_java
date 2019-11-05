import java.util.Date;

public class Married extends CommunityMem {
    private int LearningYears;

    public Married(int id, String name, String gender, String address, Date birthday, int torahHours, int workHours, int salary, int usedFromGemach, int learningYears) {
        super(id, name, gender, address, birthday, torahHours, workHours, salary, usedFromGemach);
        LearningYears = learningYears;
        try {
            if(torahHours+workHours<80)
                throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e){

        }
    }

    public int getLearningYears() {
        return LearningYears;
    }

    public void setLearningYears(int learningYears) {
        LearningYears = learningYears;
    }

    @Override
    public int TaxWage() {
        if (this.LearningYears>7)
            return 0;
        return 20;//percentage
    }

    @Override
    public int MaxGemach() {
        if (this.LearningYears>5)
            return this.LearningYears*50000;
        return 50000;//percentage
    }

    @Override
    public int AvgVolunteer() {
        return 9 - this.getTorahHours();
    }
}
