import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        CheckCards checker = new Quads();

        checker.check(fillTheMap());
    }

    public static LinkedHashMap<String, Integer> fillTheMap(){
        LinkedHashMap<String, Integer> cardsMap = createCardsMap();
        String [] cards = inputCards();

        for (String card: cards) {
            cardsMap.put(card, cardsMap.get(card) + 1);
        }
        return cardsMap;
    }

    public static String [] inputCards() {
        System.out.println("Please enter, your combination of 5 cards.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String [] cards = reader.readLine().split(" ");
            cards = checkNumberOfCards(cards);
            return cards;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("There are some exception.");
        } return null;
    }

    public static String[] checkNumberOfCards(String[] cards) {
        if (cards.length < 5 || cards.length > 5) {
            System.out.println("You entered the incorrect number of cards");
            return inputCards();
        }
        return cards;
    }

    public static LinkedHashMap<String, Integer> createCardsMap() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        linkedHashMap.put("2", 0);
        linkedHashMap.put("3", 0);
        linkedHashMap.put("4", 0);
        linkedHashMap.put("5", 0);
        linkedHashMap.put("6", 0);
        linkedHashMap.put("7", 0);
        linkedHashMap.put("8", 0);
        linkedHashMap.put("9", 0);
        linkedHashMap.put("10", 0);
        linkedHashMap.put("J", 0);
        linkedHashMap.put("Q", 0);
        linkedHashMap.put("K", 0);
        linkedHashMap.put("A", 0);
        return linkedHashMap;
    }

}
