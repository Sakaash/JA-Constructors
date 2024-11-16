package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface RemoteControlCar {
    void drive();
    int getDistanceTravelled();
}

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled = 0;
    private int noOfVictories = 0;

    public void drive() {
        distanceTravelled+=10;
    }
    
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setNumberOfVictories(int noOfVictories) {
        this.noOfVictories = noOfVictories;
    }

    public int getNumberOfVictories() {
        return this.noOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.noOfVictories, this.noOfVictories);        
    }
}

class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled = 0;

    public void drive() {
        distanceTravelled+=20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    } 
}

class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> sortedCars = new ArrayList<>(cars);
        Collections.sort(sortedCars);
        return sortedCars;
    }
}

class Main {
    public static void main(String[] args) {
        ProductionRemoteControlCar prodCar = new ProductionRemoteControlCar();
        ExperimentalRemoteControlCar expCar = new ExperimentalRemoteControlCar();

        prodCar.drive();
        expCar.drive();

        System.out.println("Production car distance: " +prodCar.getDistanceTravelled());
        System.out.println("Experimental car distance: " +expCar.getDistanceTravelled());

        TestTrack.race(expCar);
        TestTrack.race(prodCar);

        System.out.println("Production car distance: " +prodCar.getDistanceTravelled());
        System.out.println("Experimental car distance: " +expCar.getDistanceTravelled());

        ProductionRemoteControlCar car1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar car2 = new ProductionRemoteControlCar();
        car1.setNumberOfVictories(2);
        car2.setNumberOfVictories(3);

        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(car2);
        unsortedCars.add(car1);

        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
        System.out.println("Ranked car 1 victories: " + rankings.get(0).getNumberOfVictories());
        System.out.println("Ranked car 2 victories: " + rankings.get(1).getNumberOfVictories());
    }
}
