package com.aichallenge.practice;

import fr.emse.fayol.maqit.simulator.SimFactory;
import fr.emse.fayol.maqit.simulator.components.Obstacle;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;

public class CustomSim extends SimFactory {
    private static int idObstacle = 0;

    public CustomSim(SimProperties sp, GridManagement env) {
        super(sp, env);
    }

    @Override
    public void createObstacle() {
        lobstacle.add(new Obstacle(idObstacle++,environment.getPlace()));
    }

    @Override
    public void createObstacle(int[] ints) {

    }

    @Override
    public void createTurtlebot() {

    }

    @Override
    public void createTurtlebot(int[] ints) {

    }

    @Override
    public void schedule() {

    }
}