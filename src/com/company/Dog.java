package com.company;

class Dog extends Animal {

    protected boolean swim;
    int jump; {}
    public Dog(String name, int run, boolean swim, int jump) {
        this.swim = swim;
        this.run = run;
        this.name = name;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("CatName: " + name +"  |" + " RunLimit: " + run + " Meters" + "  |" + " Swim: " + swim + "  |" + " Jump: " + jump + " " + "Meters.");
    }
}