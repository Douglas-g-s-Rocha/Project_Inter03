package Programa.Utilitario;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

    static NumberFormat FormatValues = new DecimalFormat("R$ #,##0.00");

    public static String DoubleToString(double value) {
        return FormatValues.format(value);
    }


}
