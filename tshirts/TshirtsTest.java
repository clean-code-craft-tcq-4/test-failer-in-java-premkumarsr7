import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */

/**
 * @author msp5cob
 */
public class TshirtsTest {

  @Test
  public void assertTshirtSize(final String size, final String expectedSize) {
    assertEquals(size, expectedSize);
  }
}
