import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */

/**
 * @author msp5cob
 */
public class MisalignedTest {

  @Test
  public void assertColorCode(final HashMap<Integer, String> colorCodeMap) {
    assertEquals("White | Blue", colorCodeMap.get(1));
    assertEquals("White | Orange", colorCodeMap.get(2));
  }
}
