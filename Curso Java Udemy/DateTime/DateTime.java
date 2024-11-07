import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;


public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();// DATA LOCAL
        LocalDateTime d02 = LocalDateTime.now();// DATA E HORA LOCAL

        Instant d03 = Instant.now();//DATA E HORA DO FUSO 0

        LocalDate d04 = LocalDate.parse("2022-07-20");//DATA DE ACORDO COM A FORMATAÇÃO
        LocalDateTime d05 = LocalDateTime.parse("2024-11-22T16:39");//DATA E HORA DE ACORDO COM A FORMATAÇÃO

        Instant d06 = Instant.parse("2024-11-22T16:39:00z");//DATA E HORA DO FUSO 0 DE ACORDO COM A ISO
        Instant d07 = Instant.parse("2024-11-22T16:39:00-03:00");//DATA E HORA DO FUSO - 3 QUE É O FUSO DO BRASIL

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // FORMATANDO ENTRADA DATA
        LocalDate d08 = LocalDate.parse("12/11/2024",formatter);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");// FORMATANDO ENTRADA DATA TIME
        LocalDateTime d09 = LocalDateTime.parse("12/11/2024 16:47",formatter2);

        LocalDate d10 = LocalDate.of(2020,11,12); // ENTRADA DE ACORDO COM VARIAVEIS SOLTAS
        LocalDateTime d11 = LocalDateTime.of(2024,11,12,16,52);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);

    }
}