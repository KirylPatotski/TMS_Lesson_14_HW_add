package main1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Defines a simulated class at school with random names and random class sizes.
 */

public class Main1 {
    public static void main(String[] args) {

        ArrayList<String> classMates = defineClassMembers(20);
        System.out.println(classMates.size());
        sayAllWithA(classMates);
    }

    private static ArrayList<String> defineClassMembers(int Elements){
        ArrayList<String> classMate = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> family = new ArrayList<>();
        names.add("Alex");
        names.add("Alexey");
        names.add("Vladimir");
        names.add("Max");
        names.add("Andrew");
        names.add("James");
        names.add("Kevin");
        names.add("Tim");

        names.add("Tanja");
        names.add("Svetlana");
        names.add("Vera");
        names.add("Margret");
        names.add("Katelyn");
        names.add("Masha");
        names.add("Stephanie");
        names.add("Ella");

        family.add("Biden");
        family.add("Armstrong");
        family.add("Einstein");
        family.add("Oppenheimer");
        family.add("Zuckerberg");
        family.add("Bieber");
        family.add("Gates");

        for (int i = 0; i < ThreadLocalRandom.current().nextInt(10,30); i++) {
            int temporaryNumberForName = ThreadLocalRandom.current().nextInt(0,names.size());
            int temporaryNumberForFamily = ThreadLocalRandom.current().nextInt(0,family.size());
            String name = names.get(temporaryNumberForName) + " " + family.get(temporaryNumberForFamily);
            classMate.add(name.toUpperCase(Locale.ROOT));
        }
        System.out.println(classMate);
        return classMate;
    }

    private static void sayAllWithA(ArrayList<String> classMates){
        if (classMates.isEmpty()) {System.out.println("@Empty");System.exit(-1);}
        Collections.sort(classMates);
        for (int i = 0; i < classMates.size(); i++) {
            if (classMates.get(i).startsWith("A") || classMates.get(i).startsWith("a") ) System.out.println(classMates.get(i));
        }
        System.out.println();
        System.out.println(classMates.get(0)+ " is the first element");

    }
}
