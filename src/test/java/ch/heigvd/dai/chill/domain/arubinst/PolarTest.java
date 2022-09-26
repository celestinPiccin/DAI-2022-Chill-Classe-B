package ch.heigvd.dai.chill.domain.arubinst;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PolarTest {

  @Test
  void thePriceAndNameForPolarShouldBeCorrect() {
    Polar beer = new Polar();
    assertEquals(beer.getName(), Polar.NAME);
    assertEquals(beer.getPrice(), Polar.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPolar() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.arubinst.Polar";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Polar.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
