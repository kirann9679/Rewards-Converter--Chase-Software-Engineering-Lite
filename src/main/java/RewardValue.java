public class RewardValue {

    public double cashValue;

    public RewardValue( double cash){
        this.cashValue=cash;
    }
    public RewardValue(int miles) {
        this.cashValue=convertToCash(miles);
    }
    public static double convertToCash(int miles) {
        return miles * 0.0035;
    }
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }
    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
