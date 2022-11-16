package com.joaco;

public class Programmer extends Employee {

    private String[] programmingLanguages;

    public Programmer(String name,
                      int age,
                      String adress,
                      String experience) {
        super(name, age, adress, experience);

    }

    public Programmer(String name,
                      int age,
                      String adress,
                      String experience,
                      String[] programmingLanguages) {
        super(name, age, adress, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeSomeCode() {
        super.sayHi();
        System.out.println(this.name + ": Writing some code");
    }

    @Override
    public void sayHi() {
        var msg = """
                Hello my name is %s
                I am a programmer
                """.formatted(this.name);
        System.out.println(msg);
    }
}
