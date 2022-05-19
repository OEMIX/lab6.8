package com.company;

public class Main {

    public static void main(String[] args) {

        Mana mymana= new Mana(0.5,400,5);
        HP health = new HP(2.5,800,5);
        Person axe = new Person(5,5,1,0,"Axe");


        mymana.setRegeneration(0.5); mymana.setAmount(400); mymana.setIntelligence(5);
        health.setRegeneration(2.5); health.setAmount(800); health.setEndurance(5);
        axe.setPower(5); axe.setDexterity(5); axe.setLvl(1); axe.setFatigue(0); axe.setName("Axe");


        System.out.println("Ім`я героя : "+ axe.getName()+" , lvl: "+ axe.getLvl()+", статус : Сила -"+ axe.getPower()+" , ловкість-"+ axe.getDexterity());
        System.out.println("Мана: об'єм-"+ mymana.getAmount()+" , регенерація-"+ mymana.getRegeneration() +" , інтелект-"+ mymana.getIntelligence());
        System.out.println("Здоров'я : об'єм-"+ health.getAmount()+" , регенерація-"+ health.getRegeneration() +" , Витривалість-"+ health.getEndurance());
        System.out.println();

        axe.fight_lvl();
        System.out.println("Після бою втома піднялася до : "+ axe.fight_fatigue(0));
        System.out.println("Після бою втома2 піднялася до : "+ axe.fight_fatigue2());
        health.fight_endurance();
        mymana.fight_Intelligence();
        System.out.println("Регенерація Mana тепер : "+mymana.fight_amount_mana(0.5)+" , а HP : "+health.fight_amount_HP(2.5));
        System.out.println("Регенерація Mana2 тепер : "+mymana.fight_amount_mana()+" , а HP2 : "+health.fight_amount_HP());
        System.out.println();

        Person.boss_heks(500,10,8,4);
        Mana.boss_mana(900,10);
        HP.boss_HP(780,10);
        System.out.println();

        Person myperson1 = new Person(5,5,1,0,"Axe");
        Person myperson2 = new Person();
        Person mysum = new Person(5);

        System.out.println(myperson1.volume());
        System.out.println(myperson2.volume());
        System.out.println(mysum.volume());

        axe.a();



    }
}