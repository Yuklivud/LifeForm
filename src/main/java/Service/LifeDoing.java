package Service;

import Organisms.Animals.Animal;
import Organisms.Organism;

import java.util.HashMap;
import java.util.Map;

public class LifeDoing {
    public void move(Map<Integer, HashMap<Class<? extends Organism>, Integer>> collection){
        for (Map.Entry<Integer, HashMap<Class<? extends Organism>, Integer>> entry : collection.entrySet()) {
            HashMap<Class<? extends Organism>, Integer> innerMap = entry.getValue();

            for (Map.Entry<Class<? extends Organism>, Integer> innerEntry : innerMap.entrySet()) {
                Class<? extends Organism> animalClass = innerEntry.getKey();
                try {
                    Animal animal = (Animal) animalClass.newInstance();
                    animal.move();
                } catch (Exception ignored){}
            }
        }
    }
    public void eat(){}
}
