import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by User on 11.11.2017.
 */
class TablouRefacutTest {
    @org.junit.jupiter.api.Test
        void cauta() {
            List<Integer> tablouPtTest = new ArrayList<>();
            tablouPtTest.add(2);
            tablouPtTest.add(5);
            tablouPtTest.add(8);
            tablouPtTest.add(2);
            tablouPtTest.add(7);
            tablouPtTest.add(6);
            tablouPtTest.add(2);
            tablouPtTest.add(5);
            tablouPtTest.add(4);
            tablouPtTest.add(4);
            assertEquals(TablouRefacut.cauta(tablouPtTest, 7), true);
        assertEquals(TablouRefacut.cauta(tablouPtTest, 12), false);
    }

    @org.junit.jupiter.api.Test
    void transforma() {
        List<Integer> tablouPtTest = new ArrayList<>();
        tablouPtTest.add(2);
        tablouPtTest.add(5);
        tablouPtTest.add(8);
        tablouPtTest.add(2);
        tablouPtTest.add(7);
        tablouPtTest.add(6);
        tablouPtTest.add(2);
        tablouPtTest.add(5);
        tablouPtTest.add(4);
        tablouPtTest.add(4);
        List<Integer> tablouRezultat =new ArrayList<>();
        tablouRezultat.add(2);
        tablouRezultat.add(5);
        tablouRezultat.add(8);
        tablouRezultat.add(7);
        tablouRezultat.add(6);
        tablouRezultat.add(4);
        assertEquals(TablouRefacut.transformaTablou(tablouPtTest),tablouRezultat);
    }

}