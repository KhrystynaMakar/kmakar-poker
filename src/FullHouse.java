import java.util.Map;

public class FullHouse implements CheckCards {

    private CheckCards nextProof = new Straight();

    @Override
    public void check(Map<String, Integer> cardsMap) {
        if (cardsMap.containsValue(2) && cardsMap.containsValue(3)) {
            System.out.println("You have a Full House.");
        } else {
            this.nextProof.check(cardsMap);
        }
    }
}
