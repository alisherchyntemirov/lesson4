package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(500);
        boss.setDefense("magic");
        System.out.println("health:"+boss.getHealth() + " damage: "+boss.getDamage() +" defence: "+ boss.getDefense());
    }
}
