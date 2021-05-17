package com.company.presentation;

import com.company.logic.Logic;

public class Presentation {
    private Logic l;

    public Presentation() {
        this.l = new Logic();
    }

    public void start() {
        double perimeter = l.perimeter();
        double content = l.content();
        System.out.println("Průměrný obvod je "+perimeter);
        System.out.println("Průměrný obsah je "+content);
    }
}
