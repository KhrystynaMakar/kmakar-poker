import java.util.Map;


public class Quads implements CheckCards {

    private CheckCards nextProof = new FullHouse();

    @Override
    public void check(Map<String, Integer> cardsMap) {
        if (cardsMap.containsValue(4)) {
            System.out.println("You have a four of a kind (Quads).");
        } else {
            this.nextProof.check(cardsMap);
        }
    }
}
