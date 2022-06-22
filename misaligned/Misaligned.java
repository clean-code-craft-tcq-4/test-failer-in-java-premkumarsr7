import java.util.HashMap;

public class Misaligned {

  static HashMap<Integer, String> printColorMap() {
    HashMap<Integer, String> colorCodeMap = new HashMap<>();
    String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
    String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
    int i = 0, j = 0;
    for (i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        colorCodeMap.put((i * 5) + j, majorColors[i] + " | " + minorColors[i]);
        System.out.printf("%d | %s | %s\n", (i * 5) + j, majorColors[i], minorColors[i]);
      }
    }
    return colorCodeMap;
  }

  public static void main(final String[] args) {
    MisalignedTest misalignedTest = new MisalignedTest();
    misalignedTest.assertColorCode(printColorMap());
  }
}
