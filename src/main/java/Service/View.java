package Service;

import Organisms.Organism;

import java.util.HashMap;

public class View {
    public void show(HashMap<Class<? extends Organism>, Integer> collection){
        System.out.println(collection.toString());
        System.out.println("\n\n");
    }
}
