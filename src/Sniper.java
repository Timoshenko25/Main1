import java.util.ArrayList;
import java.util.List;

public  class Sniper extends Parameter{
    public Sniper (String name,Coordinates coordinates,Boolean Health,Integer Arrows){
        super(name,coordinates,1,Health,Arrows);


    }
    public Coordinates Search_opponent(Teams teams){
        Coordinates Coordinates1 = null;
        double minDistance = Double.MAX_VALUE;
        for (Parameter param : teams.getTeams()){
            if( param instanceof Peasant  || param instanceof Magicians ||param instanceof Infantry ){
                double distance = Coordinates.calculating_distances(this.coordinates, param.coordinates);
                if(distance < minDistance){
                    minDistance = distance;
                    Coordinates1 = param.coordinates;
                }
            }
        }
        return Coordinates1;
    }
    public void step(Teams teams) {
        if (Health == true || Arrows > 0) {
            Coordinates c = Search_opponent(teams);
            List<Parameter> toRemove = new ArrayList<>();

            for (Parameter param : teams.getTeams()) {
                param.coordinates = c;
                if (param instanceof Peasant || param instanceof Magicians || param instanceof Infantry) {
                    toRemove.add(param);
                }
            }

            for (Parameter param : toRemove) {
                teams.remove(param);
            }

            System.out.println("Лучник атакует ближайшего противника");
            Arrows--;
        }
    }
    @Override
    public String getInfo() {
        String s = name+"Координаты :"+coordinates+"жив"+getHealth()+"количество стрел"+getArrows();
        return s;
    }
}
