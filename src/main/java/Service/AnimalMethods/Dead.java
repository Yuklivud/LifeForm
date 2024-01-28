package Service.AnimalMethods;

import Organisms.Organism;

import java.util.HashMap;
import java.util.Map;

public class Dead {
    public void dead(Map<Integer, HashMap<Class<? extends Organism>, Integer>> collection, int position){
        HashMap<Class<? extends Organism>, Integer> mapToKill = collection.get(position);
        Class<? extends Organism> organismClass = Organism.class;
        int currentInt = mapToKill.get(organismClass);
        int newInt = currentInt - 1;
        mapToKill.put(organismClass, newInt);
        collection.put(position, mapToKill);
    }
}
