public class ResidentialSite extends Site{

    @Override
    public double base() {
        return super.base();
    }

    @Override
    public double tax() {
        return super.tax();
    }

    public double getBillableAmount(){
        return tax()+base();
    }
}
