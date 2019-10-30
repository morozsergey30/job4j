package tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenDeleteItemThenTrue() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        String id = item.getId();
        boolean result = tracker.delete(id);
        assertThat(result, is(true));
    }
    @Test
    public void whenArrayHasThreeItemThenLength3() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        int result = tracker.findAll().length;
        int expected = 3;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSecondIdThanNameTest2() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        tracker.add(first);
        Item item = tracker.add(second);
        tracker.add(third);
        String result = tracker.findById(item.getId()).getName();
        String expected = "test2";
        assertThat(result, is(expected));
    }
}
