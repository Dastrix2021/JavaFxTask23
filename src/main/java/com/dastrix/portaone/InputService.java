package com.dastrix.portaone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputService {
    private static List<String> getWordsList(String text) {
        return Arrays.stream(text.split(" "))
                .collect(Collectors.toList());
    }
    private static char getUniqueChar(String word) {
        return word.chars()
                .filter((c) -> word.indexOf(c) == word.lastIndexOf(c))
                .mapToObj(c -> (char) c)
                .findFirst()
                .orElse(' ');
    }
    public static char finalUniqueChar(String input) {
        StringBuilder sb = new StringBuilder();
        List<String> stringList = getWordsList(input);
        stringList.forEach(word -> sb.append(getUniqueChar(word)));
        return getUniqueChar(sb.toString());
    }


}
