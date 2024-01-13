package org.example;

import org.example.framework.Context;
import org.example.model.Car;
import org.example.model.Motorbike;

public class Main {
    public static void main(String[] args) {
        var context = Context.load("org.example.model");
        System.out.println(context.getLoadedClasses());

        try {
            var motrbike = (Motorbike) context.get("Motorbike");
            System.out.println(motrbike.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}