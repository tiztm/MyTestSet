package biz.MapReduceTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * author: hinkmond
 */
public class JavaAdvDataStreams01 {

    public static void main(String[] args) {

        final List<String> femaleNamesList = Arrays.asList(
                "Amy", "Debbie", "Jane", "Justine"
        );

        String[] namesArray = new String[] {
                "FRED", "debbie", "AMY", "JanE", "TheodoRe",
                "Leonard", "Ralph", "JuStiNE", "SaMUel",
                "GEORge", "ALBErt"
        };
            /**
        // Create a sample Data Stream a String array
        Stream<String> mapStream = Arrays.stream(namesArray);

        // Example of map, filter, then reduce for finding female names
        String searchResultString = mapStream
                .map(s -> {
                    String lowerCaseStr = s.toLowerCase();
                    return Character.toUpperCase(lowerCaseStr.charAt(0)) +
                            lowerCaseStr.substring(1);})
                .filter(femaleNamesList::contains)
                .reduce("Search results:", (accumulator, mapValue) -> {
                    return accumulator.endsWith(":") ?
                            accumulator + " " + mapValue :
                            accumulator + ", " + mapValue;
                });

        // List all newly mapped elements
        System.out.println(searchResultString);

        // Show result of convenient map count()
        System.out.println("Number of female names found = " +
                searchResultString.split(", ").length);*/

    }
}
