public class Single extends CommunityMem {
    private int LearningYears;

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
        return 0 ;
    }
}
