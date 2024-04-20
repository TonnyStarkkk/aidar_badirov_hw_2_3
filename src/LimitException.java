class LimitException extends Throwable{

    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
