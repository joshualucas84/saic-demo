package saic.demo.excercise
import java.text.SimpleDateFormat


class DateParse {
    static String convertDate(String dateIn) {
         String dateString = dateIn.replaceFirst("[a-zA-Z]{2}", "")
         Date date =  new SimpleDateFormat('dd MMMM yyyy').parse(dateString)
         String newDate = new SimpleDateFormat("yyyy-MM-dd").format(date)
        return  newDate
    }
}
