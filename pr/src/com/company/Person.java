package com.company;

import java.util.Scanner;

 class Person {
    private int lvl; // уровень
    private int power; // сила
    private int dexterity; //ловкість
    private String name; // імя
    private int fatigue; //втома

    int initial_number = 2;

    Scanner sc = new Scanner(System.in);

    public Person(int power, int dexterity,int lvl, int fatigue,String name) {
        this.power = power;
        this.dexterity = dexterity;
        this.name = name;
        this.lvl = lvl;
        this.fatigue = fatigue;
    }

    void  fight_lvl() {
        int attack;
        int training = (int) (Math.random() * initial_number+1);
        System.out.println("Щоб пеермогти противника потрібно провести точну атаку");
        System.out.println("Введіть число від 1 до "+initial_number);
        attack = sc.nextInt();
        if (attack == training) {
            System.out.println("перемога");
            lvl += 1;
        } else if (attack != training) {
            System.out.println("промах");
        }
    }

    int fight_fatigue(int fatigue) {
        int f = fatigue+50;
        return f;
    }
    double fight_fatigue2(){
        double f2 = fatigue+50;
        return f2;
    }
    static void boss_heks(int hp, int power, int dexterity, int lvl){
        System.out.println("Щоб битися з боссом потрібно мати мінімально : lvl - "+lvl+ ", hp - "+hp+", power - "+power+", dexterity - "+dexterity);
    }
    Person(){
        lvl = 0;
        power = 0;
        dexterity = 0;
        fatigue = 0;
    }
    Person(int heks){
        power = dexterity = fatigue = heks;
    }
    int volume() {
        return power*dexterity*fatigue;
    }

     public int getLvl() {
         return lvl;
     }

     public void setLvl(int lvl) {
         this.lvl = lvl;
     }

     public int getPower() {
         return power;
     }

     public void setPower(int power) {
         this.power = power;
     }

     public int getDexterity() {
         return dexterity;
     }

     public void setDexterity(int dexterity) {
         this.dexterity = dexterity;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getFatigue() {
         return fatigue;
     }

     public void setFatigue(int fatigue) {
         this.fatigue = fatigue;
     }

     void a (){
        System.out.println("Що б перейти на 2 уровень складності потрібно :");
        System.out.println("Уровень - 10, сила - 50, спритність - 50, інтелект - 50, витривалість - 50");
     }
 }