import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int dataYear = date.getYear();
        System.out.println("Anno: " + dataYear);

        Month dataMonth = date.getMonth();
        System.out.println("Mese: " + dataMonth);

        int dataDay = date.getDayOfMonth();
        System.out.println("Giorno: " + dataDay);

        DayOfWeek dataDayOfWeek = date.getDayOfWeek();
        System.out.println("Giorno della settimana: " + dataDayOfWeek);
    }
}