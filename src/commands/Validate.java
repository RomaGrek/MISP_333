package commands;

import java.util.Arrays;

public class Validate {
    public static String validate(String[] partWord) {
        if (validateX(partWord[1]) && validateY(partWord[2]) && validateR(partWord[3])) {
            return "OK";
        }else {
            if (!validateX(partWord[1])) {
                return "Вы ввели некорректное значение X, для подробной информации вызовите команду  help";
            }else if (!validateY(partWord[2])) {
                return "Вы ввели некорректное значение Y, для подробной информации вызовите команду  help";
            }else  {
                return "Вы ввели некорректное значение R, для подробной информации вызовите команду  help";
            }
        }
    }

    public static boolean validateX(String x) {
        try {
            double xVal = Double.parseDouble(x);
            return (-3 < xVal) && (xVal < 5);
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validateY(String y) {
        try {
            Integer valuesY[] = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
            Integer yVal = Integer.parseInt(y);
            return Arrays.asList(valuesY).contains(yVal);
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validateR(String r) {
        try {
            Double valuesR[] = {1.0, 1.5, 2.0, 2.5, 3.0};
            double rVal = Double.parseDouble(r);
            return Arrays.asList(valuesR).contains(rVal);
        }catch (NumberFormatException e) {
            return false;
        }
    }
}
