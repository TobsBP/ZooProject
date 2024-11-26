package Func;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public String time_dateNow() {
        
        LocalDateTime now = LocalDateTime.now(); // obtendo o horario atual 

        // definindo o formato desejado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
        
        // retornando o horario now no formato desejado
        return now.format(formatter); 
    }
}
