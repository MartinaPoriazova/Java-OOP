package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        Treasure treasure = new Treasure(scanner.nextLine().split("\\s+"));

        Bag bag = new Bag(capacity);

        for (var pair : treasure) {
            String first = pair.getFirst();
            Long value = pair.getSecond();

            String type = "";

            if (first.length() == 3) {
                type = "Cash";
            } else if (first.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (first.toLowerCase().equals("gold")) {
                type = "Gold";
            }
            if (bag.hasRoomFor(value) && type != null) {
                // ako e wqrno da dobavqme
            }
        }

//
//            if (treasureType.equals("")) {
//                continue;
//            } else if (capacity
//                    < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum()
//                    + treasureTypeCount) {
//                continue;
//            }
//
//            switch (treasureType) {
//                case "Gem":
//                    if (!bag.containsKey(treasureType)) {
//                        if (bag.containsKey("Gold")) {
//                            if (treasureTypeCount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
//                                continue;
//                            }
//                        } else {
//                            continue;
//                        }
//                    } else if (bag.get(treasureType).values().stream().mapToLong(e -> e).sum() + treasureTypeCount > bag
//                            .get("Gold")
//                            .values().stream().mapToLong(e -> e).sum()) {
//                        continue;
//                    }
//                    break;
//                case "Cash":
//                    if (!bag.containsKey(treasureType)) {
//                        if (bag.containsKey("Gem")) {
//                            if (treasureTypeCount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
//                                continue;
//                            }
//                        } else {
//                            continue;
//                        }
//                    } else if (bag.get(treasureType).values().stream().mapToLong(e -> e).sum() + treasureTypeCount > bag
//                            .get("Gem")
//                            .values().stream().mapToLong(e -> e).sum()) {
//                        continue;
//                    }
//                    break;
//            }
//
//            if (!bag.containsKey(treasureType)) {
//                bag.put((treasureType), new LinkedHashMap<String, Long>());
//            }
//
//            if (!bag.get(treasureType).containsKey(treasureTypeWord)) {
//                bag.get(treasureType).put(treasureTypeWord, 0L);
//            }
//
//            bag.get(treasureType)
//                    .put(treasureTypeWord, bag.get(treasureType).get(treasureTypeWord) + treasureTypeCount);
//            if (treasureType.equals("Gold")) {
//                gold += treasureTypeCount;
//            } else if (treasureType.equals("Gem")) {
//                gems += treasureTypeCount;
//            } else if (treasureType.equals("Cash")) {
//                cash += treasureTypeCount;
//            }
//        }
//
//        for (var x : bag.entrySet()) {
//            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();
//
//            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));
//
//            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
//                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
//
//        }
//    }
//}
    }
}