package ch.heigvd.dai.chill.domain.azzen;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;
public class Leffe implements IProduct {
    public final static String NAME = "Leffe";
    public final static BigDecimal PRICE = new BigDecimal(4.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
