import Organisms.Animals.Animal;
import Service.Initialization;
import Service.View;
import Organisms.Organism;

import java.util.HashMap;
import java.util.Map;

public class Runner implements Runnable{
    public Map<Integer, HashMap<Class<? extends Organism>, Integer>> collection = new HashMap<>();
    public int cellsNumber = 2_000;

    {
        Initialization initialization = new Initialization();
        initialization.initSymbols(collection, cellsNumber);
    }
    @Override
    public void run() {
        View view = new View();
        view.show(collection);
    }
}
