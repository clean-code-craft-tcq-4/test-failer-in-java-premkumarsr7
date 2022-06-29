public class Alerter {

  static int alertFailureCount = 0;


  static int networkAlert(final float celcius) {
    System.out.println("ALERT: Temperature is " + celcius + " celcius");
    if (celcius > 200) {
      return 500;
    }
    return 200;
  }

  static int networkAlertStub(final float celcius) {
    System.out.println("ALERT: Temperature is " + celcius + " celcius");
    // Return 200 for ok
    // Return 500 for not-ok
    // stub always succeeds and returns 200
    return 200;
  }

  static void alertInCelcius(final float farenheit, final boolean testFlag) {

    int status = 200;
    if (testFlag) {
      status = networkAlertStub(convertFromFarenheitToCelcius(farenheit));
    }
    else {
      status = networkAlert(convertFromFarenheitToCelcius(farenheit));
    }
    if (status != 200) {
      // non-ok response is not an error! Issues happen in life!
      // let us keep a count of failures to report
      // However, this code doesn't count failures!
      // Add a test below to catch this bug. Alter the stub above, if needed.
      alertFailureCount++;
    }
  }

  static float convertFromFarenheitToCelcius(final float farenheit) {
    return ((farenheit - 32) * 5) / 9;
  }

  public static void main(final String[] args) {
    alertInCelcius(400.5f, true);
    alertInCelcius(303.6f, true);
    AlerterTest alerterTest = new AlerterTest();
    alerterTest.assertAlertCount(alertFailureCount);
  }
}
