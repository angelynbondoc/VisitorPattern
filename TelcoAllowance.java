public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoName + " Promo Price is ₱" + money + " per month.";
    }
}