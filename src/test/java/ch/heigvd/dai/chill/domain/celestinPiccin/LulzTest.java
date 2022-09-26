package ch.heigvd.dai.chill.domain.celestinPiccin;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LulzTest {

  @Test
  void thePriceAndNameForLulzShouldBeCorrect() {
    Lulz beer = new Lulz();
    assertEquals(beer.getName(), Lulz.NAME);
    assertEquals(beer.getPrice(), Lulz.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLulz() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.celestinPiccin.Lulz";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Lulz.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
