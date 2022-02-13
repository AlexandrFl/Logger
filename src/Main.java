import java.util.*;

public class Main {
    protected static List<Integer> source = new ArrayList<>();
    protected static int size;
    protected static int max;
    protected static int limit;
    protected static Date date = new Date();
    protected static Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        userInterf();
        Filter filter = new Filter(limit);
        createSours(size, max, source);
        filter.filterOut(source, date);

    }

    public static void createSours(int size, int max, List<Integer> source) {
        Random random = new Random();
        logger.log(date + " Создаем и наполняем список");
        System.out.println("\\/ Значения случайного списка \\/ ");
        for (int i = 0; i < size; i++) {
            int a = random.nextInt(max);
            source.add(a);
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void userInterf() {
        try {
            Scanner sc = new Scanner(System.in);
            logger.log(date + " Запуск программы");
            logger.log(date + " Просим пользователя ввести размер списка");
            System.out.println("Введите размер списка");
            size = sc.nextInt();
            logger.log(date + " Просим пользователя ввести верхнюю границу значений списка");
            System.out.println("Введите верхнюю границу для значения");
            max = sc.nextInt();
            logger.log(date + " Просим пользователя ввести пороговое значение для фильтра");
            System.out.println("Ведите порог для фильтра");
            limit = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено неверное значение.\nНеобходимо ввести целочисленное значение");
        }
    }
}
