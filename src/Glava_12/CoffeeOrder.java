package Glava_12;

import java.util.*;
import java.util.stream.*;

public class CoffeeOrder {
    public static void main(String[] args) {
        List<String> coffees = List.of("Капучино", "Американо",
                "Эспрессо", "Кортадо", "Ьокка",
                "Капучино", "Флэт.уайт", "Латте");
        List<String> coffeesEndingInO = coffees.stream()
                .sorted()
                .distinct()
                .filter(s -> s.endsWith("о"))
                .collect(Collectors.toList());
        System.out.println(coffeesEndingInO);
    }
}
