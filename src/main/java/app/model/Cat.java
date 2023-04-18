package app.model;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat extends Animal {
    @Override
    public String toString() {
        return "I'm a Cat";
    }

    public Cat() {
    }

    @Override
    void say() {
        System.out.println();
    }
}
