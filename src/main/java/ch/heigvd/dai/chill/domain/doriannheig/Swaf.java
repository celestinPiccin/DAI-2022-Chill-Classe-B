package ch.heigvd.dai.chill.domain.doriannheig;

import java.math.BigDecimal;

import ch.heigvd.dai.chill.domain.IProduct;

public class Swaf implements IProduct {

    public final static String NAME = "Swaf";
    public final static BigDecimal PRICE = new BigDecimal(3.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
    
}
