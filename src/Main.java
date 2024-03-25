import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Создание первой команды
        Teams teams1 = new Teams("First");
        teams1.addParameter(new Peasant(new Coordinates(0, 0)));
        teams1.addParameter(new Magicians(new Coordinates(0, 1)));
        teams1.addParameter(new Sniper(new Coordinates(0, 2)));
        teams1.addParameter(new Infantry(new Coordinates(0, 3)));
        System.out.println("Команда 1:");
        for (Parameter param : teams1.getTeams()) {
            System.out.println(param);
        }
        Teams team2 = new Teams("Second");
        team2.addParameter(new Peasant(new Coordinates(9, 0)));
        team2.addParameter(new Magicians(new Coordinates(9, 1)));
        team2.addParameter(new Sniper(new Coordinates(9, 2)));
        team2.addParameter(new Infantry(new Coordinates(9, 3)));
        System.out.println("Команда 2:");
        for (Parameter member : team2.getTeams()) {
            System.out.println(member);
        }
        Collections.sort(teams1.getTeams(), Comparator.comparingInt(p -> p.initiative));
        // Ход персонажей с наивысшей инициативой
        for (Parameter param : teams1.getTeams()) {
            param.step(team2);
        }
        for (Parameter member : team2.getTeams()) {
            System.out.println(member);
        }

    }
}

