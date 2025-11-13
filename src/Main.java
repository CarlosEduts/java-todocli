import model.Task;
import view.Menu;
import view.Components;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task( "Ir ao mercado", "Comprar arroz e feijão", LocalDate.now(), LocalTime.now()),
                new Task( "Estudar Java", "Ler capítulos 3 e 4 do livro", LocalDate.now(), LocalTime.now()),
                new Task( "Fazer exercícios", "Resolver lista de exercícios de matemática", LocalDate.now(), LocalTime.now())
        );

        // Menu.taskDetails(new Task( "Fazer exercícios", "Resolver lista de exercícios de matemática", LocalDate.now(), LocalTime.now()));

        Components.exclude(new Task( "Fazer exercícios", "Resolver lista de exercícios de matemática", LocalDate.now(), LocalTime.now()));
    }
}
