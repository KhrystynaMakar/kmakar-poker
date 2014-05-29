import java.util.Map;

public class Straight implements CheckCards{

    private static final String straightLine = "2345678910JQKA2345";
    private static final String straightLineSpecial = "2345A";

    private CheckCards nextProof = new Set();

    @Override
    public void check(Map<String, Integer> cardsMap) {

        String str = "";

        for (Map.Entry<String, Integer> pair : cardsMap.entrySet()) {
            if (pair.getValue() != 0) {
                str += pair.getKey();
            }
        }

        if (straightLine.contains(str) || straightLineSpecial.contains(str)) {
            System.out.println("You have a Straight.");
        } else {
            this.nextProof.check(cardsMap);
        }
    }
}
