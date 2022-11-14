public class LifelineSite extends Site{

    @Override
    public double base() {
        return super.base()*0.5;
    }

    @Override
    public double tax() {
        return super.tax()*0.2;
    }

    public double getBillableAmount(){
        return tax()+base();
    }
}
