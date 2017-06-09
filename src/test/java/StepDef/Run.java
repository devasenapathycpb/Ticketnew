package StepDef;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Run {

    public static String getDate() {
        DateFormat formatter = new SimpleDateFormat("MM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE));
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
            //log.error(e);
        }
        String year = Integer.toString(cal.get(Calendar.YEAR));
        String calDate = month + "/" + date + "/" + year;
        return calDate;
    }
}
