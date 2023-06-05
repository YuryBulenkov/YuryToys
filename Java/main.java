package Java;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {

    public static void main(String[] args) {
        Toys<Toy> toys = new Toys<>();
        Queue<Toy> queue = new PriorityQueue<>(Collections.reverseOrder());
        Save save = new Save();
        RandomDropRateNumber random = new RandomDropRateNumber();
        Toy toy1 = new Toy(1, "Robot1", 2, random.rnd());
        Toy toy2 = new Toy(2, "Designer", 3, random.rnd());
        Toy toy3 = new Toy(3, "Doll", 2, random.rnd());
        Toy toy4 = new Toy(4, "Car1", 3, random.rnd());
        Toy toy5 = new Toy(5, "Ropbot2", 2, random.rnd());
        Toy toy6 = new Toy(6, "Fixik", 2, random.rnd());
        Toy toy7 = new Toy(7, "Car3", 3, random.rnd());
        Toy toy8 = new Toy(8, "Plane", 2, random.rnd());
        Toy toy9 = new Toy(9, "Car2", 3, random.rnd());
        Toy toy10 = new Toy(10, "Dinosaur", 2, random.rnd());
        toys.addToy(toy1);
        toys.addToy(toy2);
        toys.addToy(toy3);
        toys.addToy(toy4);
        toys.addToy(toy5);
        toys.addToy(toy6);
        toys.addToy(toy7);
        toys.addToy(toy8);
        toys.addToy(toy9);
        toys.addToy(toy10);
        System.out.println("List of Toys to order: \n" + toys.print());
        toys.sortByDroprate();
        System.out.println("List of Toys to get: \n" + toys.print());
        for (Toy toy : toys) {
            queue.add(toy);
        }
        save.saveResult(queue);
    }
}