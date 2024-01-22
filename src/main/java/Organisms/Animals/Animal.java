package Organisms.Animals;

import Organisms.Organism;

public interface Animal extends Organism {
    void eat();
    void move();
    void dead();
    void multiply();
}
