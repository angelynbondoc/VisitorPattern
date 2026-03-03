public interface TelcoSubscription {
    String getTelcoName();
    int getDataAllowance();
    double getPromoPrice();
    boolean getUnliCallText();
    String accept(UsagePromo promo, double price);
    String accept(UnliCallOffer unliPackage, boolean unliCallText);
}