package com.aetherwars.model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class SpellPotionCard extends SpellCard {
    private int attack;
    private int hp;
    private int duration;

    public SpellPotionCard() {
        super();
        this.attack = 0;
        this.hp = 0;
        this.duration = 0;
    }

    public SpellPotionCard(int id, String name, String description, String image_path, int attack, int hp, int mana, int duration) {
        super(id, name, description, image_path, mana, SpellType.POTION);
        this.attack = attack;
        this.hp = hp;
        this.duration = duration;
    }

    @Override
    public String preview() {
        return "ATK " + this.attack + "/HP " + this.hp + "(" + this.duration + ")";
    }

    @Override
    public String toString() {
        return  "Spell Potion" +
                "\nName:" + this.name +
                "\nDescription:" + this.description +
                "\nImage:" + this.image_path +
                "\nMana:" + this.mana +
                "\nAttack:" + this.attack +
                "\nHealth:" + this.hp +
                "\nDuration:" + this.duration;
    }

    @Override
    public List<Pair<String,String>> displayInfo() {
        List<Pair<String, String>> res = new ArrayList<>();
        res.add(new Pair<>("Mana", Integer.toString(this.mana)));
        res.add(new Pair<>("Attack", Integer.toString(this.attack)));
        res.add(new Pair<>("Health", Integer.toString(this.hp)));
        res.add(new Pair<>("Duration", Integer.toString(this.duration)));
        return res;
    }
}