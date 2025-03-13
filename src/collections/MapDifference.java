package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapDifference {

    public void givenDifferentMaps_whenGetDiffUsingGuava_thenSuccess() {
        Map<String, String> asia1 = new HashMap<String, String>();
        asia1.put("Japan", "Tokyo");
        asia1.put("South Korea", "Seoul");
        asia1.put("India", "New Delhi");

        Map<String, String> asia2 = new HashMap<String, String>();
        asia2.put("Japan", "Tokyo");
        asia2.put("China", "Beijing");
        asia2.put("India", "Delhi");

//        MapDifference<String, String> diff = Maps.difference(asia1, asia2);
//        Map<String, ValueDifference<String>> entriesDiffering = diff.entriesDiffering();
//
//        assertFalse(diff.areEqual());
//        assertEquals(1, entriesDiffering.size());
//        assertThat(entriesDiffering, hasKey("India"));
//        assertEquals("New Delhi", entriesDiffering.get("India").leftValue());
//        assertEquals("Delhi", entriesDiffering.get("India").rightValue());
    }
}
