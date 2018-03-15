package br.com.dojo.cfgdemelo.dojopuzzle.model;

import android.util.Log;

/**
 * Created by caio.melo on 15/03/18.
 */

public class Calculate {

    public boolean calculateHappinness(Integer number) {
        Integer result = returnCalculatedNumber(number);
        int size = result.toString().length();
        while (size > 1) {
            result = returnCalculatedNumber(result);
            size = result.toString().length();
        }

        if (result == 1) {
            return true;
        } else if (result.toString().length() > 1) {
            return true;
        } else {
            return false;
        }
    }

    private int returnCalculatedNumber(int number) {
        Integer result = 0;
        Integer actualNumber;
        Integer numberLength = number;
        int size = numberLength.toString().length();

        for (int i = 0; i < size; i++) {
            String numberString = numberLength.toString().substring(i,i+1);
            actualNumber = Integer.parseInt(numberString);
            result += actualNumber * actualNumber;
        }

        return result;
    }
}
