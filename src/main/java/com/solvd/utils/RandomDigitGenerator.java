package com.solvd.utils;

import java.util.Random;
import java.util.function.Supplier;

public class RandomDigitGenerator implements Supplier<Integer> {
    @Override
    public Integer get() {
        return new Random().nextInt(1000);
    }
}
