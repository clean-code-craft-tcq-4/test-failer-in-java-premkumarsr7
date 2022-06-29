import java.util.HashMap;

public class Misaligned {

  private static final String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
  private static final String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

  static HashMap<Integer, String> printColorMap(final String majorColors[], final String minorColors[]) {
    HashMap<Integer, String> colorCodeMap = new HashMap<>();
    int i = 0, j = 0;
    for (i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        colorCodeMap.put((i * 5) + j + 1, majorColors[i] + " | " + minorColors[j]);
        System.out.printf("%d | %s | %s\n", (i * 5) + j + 1, majorColors[i], minorColors[j]);
      }
    }
    return colorCodeMap;
  }

  public static void main(final String[] args) {
    MisalignedTest misalignedTest = new MisalignedTest();
    misalignedTest.assertColorCode(printColorMap(Misaligned.majorColors, Misaligned.minorColors));
  }
}
