package com.company;

 class Mana {
    private double regeneration; // регенерація
    private double amount; // об'єм
    private int intelligence; // Інтелект

    public Mana (double regeneration, double amount, int intelligence){
        this.regeneration = regeneration;
        this.amount=amount;
        this.intelligence = intelligence;
    }
    void fight_Intelligence(){
        intelligence = intelligence+2;
        System.out.println("Також, після бою інтелект піднялася на : 2 "+"("+intelligence+")");
    }
    double fight_amount_mana(double regeneration){
        double reg_mana = regeneration*2;
        return reg_mana ;
    }
    int fight_amount_mana(){
        int reg_mana2 = (int) (regeneration*2);
        return reg_mana2 ;
    }
    static void boss_mana(int amount, int intelligence){
        System.out.println("Мінімальні характеристики Mana: amount- "+amount+", intelligence - "+intelligence);
    }

     public double getRegeneration() {
         return regeneration;
     }

     public void setRegeneration(double regeneration) {
         this.regeneration = regeneration;
     }

     public double getAmount() {
         return amount;
     }

     public void setAmount(double amount) {
         this.amount = amount;
     }

     public int getIntelligence() {
         return intelligence;
     }

     public void setIntelligence(int intelligence) {
         this.intelligence = intelligence;
     }
 }