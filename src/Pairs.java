import java.util.Map;

public class Pairs implements CheckCards {

    @Override
    public void check(Map<String, Integer> cardsMap) {
        if (cardsMap.containsValue(2)) {
            int count = 0;
            for (Map.Entry<String, Integer> pair : cardsMap.entrySet()) {
                if (pair.getValue() == 2) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("You have two pairs.");
            } else {
                System.out.println("You have one pair.");
            }
        } else {
            System.out.println("You don't have any winning combination, but maybe you have a high card.");
        }
    }
}
