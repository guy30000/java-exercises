package exercises;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class test {

    public String run = "true";
    String myNameVV;
    public Calendar myDateVV;
    Calendar dateV = Calendar.getInstance();

    public test( String nameVV,Calendar dateVV)
    {
        myNameVV = nameVV;
        myDateVV = dateVV;
    }
    public String getNameVV() { return myNameVV; }
    public Calendar getDateVV() { return myDateVV; }


//
        public static void main(String[] args) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));



            // (1) get today's date
            Date today = Calendar.getInstance().getTime();
            // (2) create a date "formatter" (the date format we want)
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
            // (3) create a new String using the date format we want
            String folderName = formatter.format(today);
            // (4) this prints "Folder Name = 2009-09-06-08.23.23"
            System.out.println(folderName);


            Date todayV = Calendar.getInstance().getTime();
            // (2) create a date "formatter" (the date format we want)
            SimpleDateFormat formatterV = new SimpleDateFormat("yyyy-MM-dd");

            // (3) create a new String using the date format we want
            String folderNameV = formatterV.format(todayV);

            // (4) this prints "Folder Name = 2009-09-06-08.23.23"
            //System.out.println(folderNameV + getDateVV);


        }




    }

