package com.aetherwars.model;

public class ActiveSpellsPotion {
    private SpellPotionCard card;
    private double healthPotion;
    private double attackPotion;
    private int duration;

    public ActiveSpellsPotion(SpellPotionCard card) {
        this.card = card;
        this.healthPotion = card.getHp();
        this.attackPotion = card.getAttack();
        if (card.getDuration() == 0) {
            this.duration = -1;
        } else {
            this.duration = card.getDuration();
        }
    }

    public double getAttackPotion() {
        return (this.attackPotion);
    }

    public double getHealthPotion() {
        return (this.healthPotion);
    }

    public double getDuration() {
        return (this.duration);
    }

    public void getDamage(int damage) {
        this.healthPotion = this.healthPotion - damage;
    }

    public void setHealthPotion(double damage) { this.healthPotion = this.healthPotion - damage ;}

    public void newRound() {
        this.duration = this.duration - 1;
    }

    public void display() {
        System.out.println(this.card.getName());
        System.out.println("Attack: " + this.attackPotion);
        System.out.println("Health: " + this.healthPotion);
        System.out.print("Durasi: " + this.duration + "\n");
    }
}
