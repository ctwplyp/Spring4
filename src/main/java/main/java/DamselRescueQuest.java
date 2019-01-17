package main.java;

import main.java.Quest;

public class DamselRescueQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Rescue Damsel");
    }
}
