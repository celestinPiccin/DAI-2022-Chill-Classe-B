package ch.heigvd.dai.chill.domain.celestinPiccin;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Lulz implements IProduct {

  public final static String NAME = "Lulz";
  public final static BigDecimal PRICE = new BigDecimal(19.6);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
