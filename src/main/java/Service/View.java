package Service;

import Organisms.Animals.Animal;
import Organisms.Animals.Predators.Wolf;
import Organisms.Organism;

import java.util.HashMap;
import java.util.Map;

public class View {
    public void show(Map<Integer, HashMap<Class<? extends Organism>, Integer>> collection){
        int wolvesCount = 0;
        for(int i = 0; i < collection.size(); i++){
            if (collection.containsKey(i)) {
                HashMap<Class<? extends Organism>, Integer> cellContent = collection.get(i);
                if (cellContent.containsKey(Wolf.class)) {
                    wolvesCount += cellContent.get(Wolf.class);
                }
            }
        }
        System.out.println("Количество волков: " + wolvesCount);

    }
}
