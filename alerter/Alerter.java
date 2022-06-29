public class Alerter {

  static int alertFailureCount = 0;

  static int networkAlertStub(final float celcius) {
    System.out.println("ALERT: Temperature is " + celcius + " celcius");
    if (celcius > 200) {
      return 500;
    }
    return 200;
  }

  static void alertInCelcius(final float farenheit) {
    float celcius = ((farenheit - 32) * 5) / 9;
    int returnCode = networkAlertStub(celcius);
    if (returnCode != 200) {
      // non-ok response is not an error! Issues happen in life!
      // let us keep a count of failures to report
      // However, this code doesn't count failures!
      // Add a test below to catch this bug. Alter the stub above, if needed.
      alertFailureCount++;
    }
  }
  

  public static void main(final String[] args) {
    alertInCelcius(400.5f);
    alertInCelcius(303.6f);
    AlerterTest alerterTest = new AlerterTest();
    alerterTest.assertAlertCount(alertFailureCount);
  }
}
