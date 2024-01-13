package org.example.model;

import org.example.annotations.Autowired;
import org.example.annotations.Component;

@Component("Motorbike")
public class Motorbike {
    @Autowired
    private Body body;
    @Autowired
    private Engine engine;

    @Override
    public String toString() {
        return "Motorbike{" +
                "body=" + body +
                ", engine=" + engine +
                '}';
    }
}