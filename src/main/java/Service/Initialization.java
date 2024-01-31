package Service;

import Organisms.Animals.Animal;
import Organisms.Animals.Herbivores.*;
import Organisms.Animals.Predators.*;
import Organisms.Organism;
import Organisms.Plants.Grass;
import Organisms.Plants.Plant;

import java.util.*;

public class Initialization {
    private Random random = new Random();
    public void initSymbols(Map<Integer, HashMap<Class<? extends Organism>, Integer>> collection, int cellsNumbers, HashMap<Class<? extends Organism>, Integer> collectionToView){

        for(int i = 0; i < cellsNumbers; i++){
            createLife(collection, i, collectionToView);
        }
    }

    private void createLife(Map<Integer, HashMap<Class<? extends Organism>, Integer>> collection, int numberOfCell, HashMap<Class<? extends Organism>, Integer> collectionToView){
        HashMap<Class<? extends Organism>, Integer> content = new HashMap<>();
        // Predators

        content.put(Bear.class, random.nextInt(6));
        content.put(Wolf.class, random.nextInt(1, 31));
        content.put(Boa.class, random.nextInt(31));
        content.put(Eagle.class, random.nextInt(21));
        content.put(Fox.class, random.nextInt(31));

        // Herbivores

        content.put(Horse.class, random.nextInt(21));
        content.put(Boar.class, random.nextInt(51));
        content.put(Buffalo.class, random.nextInt(11));
        content.put(Deer.class, random.nextInt(21));
        content.put(Duck.class, random.nextInt(201));
        content.put(Goat.class, random.nextInt(141));
        content.put(Goose.class, random.nextInt(21));
        content.put(Mouse.class, random.nextInt(501));
        content.put(Rabbit.class, random.nextInt(151));
        content.put(Sheep.class, random.nextInt(141));
        content.put(Caterpillar.class, random.nextInt(1001));

        // Plants

        content.put(Grass.class, random.nextInt(201));

        collection.put(numberOfCell, content);

//        for (Map.Entry<Class<? extends Organism>, Integer> entry : content.entrySet()) {
//            collectionToView.merge(entry.getKey(), entry.getValue(), Integer::sum);
//        }
    }
}
