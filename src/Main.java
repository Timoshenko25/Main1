import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Parameter> darkTeam = new ArrayList<>();
     ArrayList<Parameter> allTeam = new ArrayList<>();
         ArrayList<Parameter> holyTeam = new ArrayList<>();
        Teams teams1 = new Teams("First");
        teams1.addParameter(new Peasant(getName(), new Coordinates(0, 0), true, 14));
        teams1.addParameter(new Magicians(getName(), new Coordinates(0, 1), true, 14));
        teams1.addParameter(new Sniper(getName(), new Coordinates(0, 2), true, 14));
        teams1.addParameter(new Infantry(getName(), new Coordinates(0, 3), true, 14));
        Teams team2 = new Teams("Second");
        team2.addParameter(new Peasant(getName(), new Coordinates(9, 0), true, 14));
        team2.addParameter(new Magicians(getName(), new Coordinates(9, 1), true, 14));
        team2.addParameter(new Sniper(getName(), new Coordinates(9, 2), true, 14));
        team2.addParameter(new Infantry(getName(), new Coordinates(9, 3), true, 14));
        System.out.println("Команда 1:");
        for (Parameter param : teams1.getTeams()) {
            System.out.println(param);
        } for (Parameter param : teams1.getTeams()) {
            darkTeam.add(param);
            allTeam.add(param);
        }
        for (Parameter member : team2.getTeams()) {
            System.out.println(member);
        }for (Parameter member : team2.getTeams()) {
            holyTeam.add(member);
            allTeam.add(member);
        }
        System.out.println();
            Collections.sort(allTeam, Comparator.comparingInt(p -> p.initiative));
            View.view();
            for (Parameter param : allTeam){
                if(holyTeam.contains(param)) {
                    param.step(darkTeam, holyTeam);
                } else {
                    param.step(holyTeam, darkTeam);
                }
            }

        }
    public static String getName(){
        return String.valueOf(Parameter.Names.values()[new Random().nextInt(Parameter.Names.values().length)].toString());
    }

}

