public class RewardValue {

    public double cashValue, miles;

    public RewardValue( double cash){
        this.cashValue=cash;
    }
    public RewardValue(float miles) {
        this.miles=miles;
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        miles=0.0035*cashValue;
        return miles;
    }
}
