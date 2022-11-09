import java.util.Comparator;

public class SortPersonLength implements Comparator<Person> {
    protected int numberWords;

    public SortPersonLength(int numberWords) {
        this.numberWords = numberWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int peopleLength1 = o1.getSurname().split("(?U)\\W+").length;
        int peopleLength2 = o2.getSurname().split("(?U)\\W+").length;
        if ((peopleLength1 >= numberWords) & (peopleLength2 >= numberWords)) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        if (peopleLength1 == peopleLength2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        if (peopleLength1 > peopleLength2) {
            return 1;
        } else if (peopleLength1 < peopleLength2) {
            return -1;
        }
        return 0;
    }
}
