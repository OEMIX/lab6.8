package com.company;

 class HP {
    private double regeneration; // регенерація
    private int amount; // об'єм
    private int endurance; // Витривалість

    public HP (double regeneration, int amount, int endurance){
        this.regeneration = regeneration;
        this.amount=amount;
        this.endurance = endurance;
    }
    void fight_endurance(){
        endurance = endurance+4;
        System.out.println("Після бою, витривалість піднялася на : 4 "+"("+endurance+")");
    }
    double fight_amount_HP(double regeneration){
        double reg_HP = regeneration * 4;
        return reg_HP ;
    }
    int fight_amount_HP() {
        int reg_HP2 = (int) (regeneration * 4);
        return reg_HP2;
    }
    static void boss_HP(int amount, int endurance){
        System.out.println("Мінімальні характеристики HP: amount- "+amount+", intelligence - "+endurance);
    }

     public double getRegeneration() {
         return regeneration;
     }

     public void setRegeneration(double regeneration) {
         this.regeneration = regeneration;
     }

     public int getAmount() {
         return amount;
     }

     public void setAmount(int amount) {
         this.amount = amount;
     }

     public int getEndurance() {
         return endurance;
     }

     public void setEndurance(int endurance) {
         this.endurance = endurance;
     }
 }