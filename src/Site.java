public class Site {
    protected int _units;
    protected int _rate;
    protected static double TAX_RATE;

    public double getBillableAmount(){
        return getBaseAmount()+getBillableAmount();
    }
    public double getBaseAmount(){
        return _units*_rate ;
    }

    public double getTaxAmount(){
        return getBillableAmount()*Site.TAX_RATE ;
    }




}
