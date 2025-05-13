import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moviesTest {

    @Test
    public void addMovie() {
        moviesManager manager = new moviesManager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джельтенмены");
        manager.add("Человек");
        manager.add("Тролли");
        manager.add("Номер один");
        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джельтенмены",
                "Человек", "Тролли", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovie() {
        moviesManager manager = new moviesManager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джельтенмены");
        manager.add("Человек");
        String[] expected = {"Человек", "Джельтенмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovie1() {
        moviesManager manager = new moviesManager();
        manager.add("Отель Белград");
        manager.add("Джельтенмены");
        manager.add("Человек");
        String[] expected = {"Человек", "Джельтенмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

