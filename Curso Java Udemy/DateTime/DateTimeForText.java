import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2024-11-12");
        LocalDateTime d02 = LocalDateTime.parse("2024-11-12T21:48:00");
        Instant d03 = Instant.parse("2024-11-12T21:48:00z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(d02.format(formatter));//chamando pela hora
        System.out.println(formatter.format(d02));//chamando pelo formatter

        //Formatar data de acordo com a localização do usuário
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(fmt2.format(d03));
    }
}