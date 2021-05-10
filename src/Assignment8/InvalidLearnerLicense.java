package Assignment8;

class InvalidLearnerLicense extends Exception {
    @Override
    public String toString() {
        return "Learner license with 30 days validity should be present";
    }
}