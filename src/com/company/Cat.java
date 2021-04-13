package com.company;
//
class Cat extends Animal {

    protected boolean swim;
    int jump; {}
    public Cat(String name, int run, boolean swim, int jump) {
        this.swim = swim;
        this.run = run;
        this.name = name;
        this.jump = jump;
    }
    public void catInfo() {
        System.out.println("CatName: " + name +"  |" + " RunLimit: " + run + " Meters" + "  |" + " Swim: " + swim + "  |" + " Jump: " + jump + " " + "Meters.");
    }
}