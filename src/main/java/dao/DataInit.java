/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.HashMap;

/**
 *
 * @author adria
 */
public class DataInit {

    HashMap<String, Boolean> lights = new HashMap<String, Boolean>();

    private void populateLights() {
        this.lights.put("kitchen", true);
        this.lights.put("living room", true);
        this.lights.put("bedroom 1", false);
        this.lights.put("bathroom 2", false);
    }

    public DataInit() {
        this.populateLights();
    }

    public HashMap<String, Boolean> getLightsHash() {
        return this.lights;
    }

    public void displayLightsStates() {
        this.lights.forEach((k, v) -> System.out.println("room: " + k + " has lights on:" + v));
    }

}
