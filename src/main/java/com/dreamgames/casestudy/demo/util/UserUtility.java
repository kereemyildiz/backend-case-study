package com.dreamgames.casestudy.demo.util;

import com.dreamgames.casestudy.demo.enums.Country;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UserUtility {
    private static final List<Country> COUNTRIES = Arrays.asList(Country.values());

    public static Country chooseRandomCountry() {
        Random random = new Random();
        int index = random.nextInt(COUNTRIES.size());
        return COUNTRIES.get(index);
    }

}
