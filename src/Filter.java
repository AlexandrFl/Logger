import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold){
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source, Date date) {
//        Date date = new Date();
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : source) {
            if (integer > treshold) {
                result.add(integer);
                logger.log(date + " Элемент " + integer + " проходит");
            } else {
                logger.log(date + " Элемент " + integer + " не проходит");
            }
        }
        return result;
    }
}
