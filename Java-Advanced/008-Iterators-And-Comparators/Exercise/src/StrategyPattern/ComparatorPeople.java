package src.StrategyPattern;

import src.ComparingObjects.Person;

import java.util.Comparator;

public class ComparatorPeople implements Comparator<src.ComparingObjects.Person> {

    @Override
    public int compare(src.ComparingObjects.Person first, Person second) {
        int result = first.getName().length() - second.getName().length();

        if (result == 0) {
            result = first.getName().toLowerCase().charAt(0) - second.getName().toLowerCase().charAt(0);
        }
        return result;
    }
}
