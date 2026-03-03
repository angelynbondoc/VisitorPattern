public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return telcoName + " offers unlimited calls and texts.";
        } else {
            return telcoName + " doesn't offer unlimited calls and texts. Charges may apply per use.";
        }
    }
}