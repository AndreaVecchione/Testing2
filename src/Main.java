import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Main {
    public static void main(String[] args) {
        //creo l'oggetto
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
//stampa della data in grandezza FULL
        String dateFull = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Grandezza piena: " + dateFull);

    }
    //metodo che andremo a testare nella classe MainTest
    static String formatInFull(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
    static String formatInMedium (OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }
}
