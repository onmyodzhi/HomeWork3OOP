package ru.gb.lessons.interfaces.core.drugStore;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    //    private List<Component> components;
    private Map<String, Integer> components;
    private int componentsCount;

    public Pharmacy() {
        this.components = new HashMap();
        this.componentsCount = 0;
    }

    public Pharmacy addComponent(Component component) {
        this.components.put(component.getName(),component.getPower());
        this.componentsCount++;
        return this;
    }

    public Map<String,Integer> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + componentsCount +
                '}' + "Total power = " + getPower(this) + "\n";
    }

    @Override
    public Iterator<Component> iterator() {
//        return new Iterator<Component>() { //Анонимный класс
//            public Component next() {
//                return components.get(componentsCount++);
//            }
//
//            public boolean hasNext() {
//                return componentsCount < components.size();
//            }
//        };
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        return Integer.compare(pow1, pow2);
//        Альтернативная запись:
//        if (pow1 > pow2) return 1;
//        else if (pow1 < pow2) return -1;
//        else return 0;
    }

    private int getPower(Pharmacy pharm) {
        int result = 0;
        int sum = components.values().stream().mapToInt(Integer::intValue).sum();
        return sum;
    }
}
