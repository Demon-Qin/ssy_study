package zyq.basedao.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @authoradmin
 * @date 2021/11/25 23:07
 * @description Hero
 */
public class Hero {
    @Deprecated
    public void say() {
        System.out.println("nothing has to say!");
    }

    public void speak() {
        System.out.println("i have a dream!");
    }

    public void addItems(String item) {
        List<String> items = new ArrayList<>();
        items.add(item);
        System.out.println("i am " + items);
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.addItems("Java工程师");
        hero.say();
        hero.speak();
    }
}
