package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishOrder = new ArrayList<>();
        ArrayList<Integer> dishes = new ArrayList<>(numberOfDishes);
        for (int i = 0; i < numberOfDishes; i++ ) {
            dishes.add(i + 1);
        }

        int curDish = 0;

        while (dishOrder.size() < numberOfDishes) {
            curDish = ((curDish + everyDishNumberToEat - 1) % dishes.size());
            int dish = dishes.get(curDish % dishes.size());
            dishes.remove((Integer) dish);
            dishOrder.add(dish);

        }
        return dishOrder;
    }
}
