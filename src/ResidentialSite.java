public class ResidentialSite extends Site{

    @Override
    public double getBaseAmount() {
        return super.getBaseAmount();
    }

    @Override
    public double getTaxAmount() {
        return super.getTaxAmount();
    }

    public double getBillableAmount(){
        return getTaxAmount()+getBaseAmount();
    }
}
