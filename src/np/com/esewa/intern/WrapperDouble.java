package np.com.esewa.intern;

public class WrapperDouble {
    /**
     *
     * @param x
     */
    public WrapperDouble(double x){
        Double d1 = new Double(x);
        Double d2 = Double.valueOf("33.55");
        double product = d1.doubleValue()*d2.doubleValue();
        System.out.println("Product of doubles:"+product);
    }
}
