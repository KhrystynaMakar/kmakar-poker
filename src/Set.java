import java.util.Map;

public class Set implements CheckCards {

    private CheckCards nextProof = new Pairs();

    @Override
    public void check(Map<String, Integer> cardsMap) {
        if (cardsMap.containsValue(3)) {
            System.out.println("You have a three of a kind (Set).");
        } else {
            this.nextProof.check(cardsMap);
        }
    }
}
