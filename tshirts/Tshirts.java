public class Tshirts {

  static String size(final int cms) {
    if (cms < 38) {
      return "S";
    }
    else if ((cms >= 38) && (cms < 42)) {
      return "M";
    }
    else {
      return "L";
    }
  }

  public static void main(final String[] args) {
    TshirtsTest tshirtsTest = new TshirtsTest();
    tshirtsTest.assertTshirtSize(size(37), "S");
    tshirtsTest.assertTshirtSize(size(38), "M");
    tshirtsTest.assertTshirtSize(size(40), "M");
    tshirtsTest.assertTshirtSize(size(43), "L");
  }
}
