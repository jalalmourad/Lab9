public class Site {
    protected int _units;
    protected int _rate;
    protected static double TAX_RATE;

    public double base(){
        return _units*_rate ;
    }

    public double tax(){
        return base()*Site.TAX_RATE ;
    }




}
