public class LifelineSite extends Site{

    @Override
    public double getBaseAmount() {
        return super.getBaseAmount()*0.5;
    }

    @Override
    public double getTaxAmount() {
        return super.getTaxAmount()*0.2;
    }

    public double getBillableAmount(){
        return getTaxAmount()+getBaseAmount();
    }
}
