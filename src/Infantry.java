import java.util.ArrayList;
import java.util.List;

public class Infantry extends Parameter {
    boolean life;
    int countArrows;

    public Infantry(Coordinates coordinates) {
        super(coordinates, 2);
        this.life = true;
        this.countArrows = 5;

    }

    public Coordinates Search_opponent1(Teams teams) {
        Coordinates Coordinates1 = null;
        double minDistance = Double.MAX_VALUE;
        for (Parameter param : teams.getTeams()) {
            if (param instanceof Peasant || param instanceof Magicians || param instanceof Sniper) {
                double distance = Coordinates.calculating_distances(this.coordinates, param.coordinates);
                if (distance < minDistance) {
                    minDistance = distance;
                    Coordinates1 = param.coordinates;
                }
            }
        }
        return Coordinates1;
    }

    public void step(Teams teams ,Infantry inf ) {
        if (life == true || countArrows > 0) {
            Coordinates c = Search_opponent1(teams);
            int X = inf.coordinates.getX();
            int Y = inf.coordinates.getY();
            List<Parameter> toRemove = new ArrayList<>();

            for (Parameter param : teams.getTeams()) {
                param.coordinates = c;
                if(Math.abs(inf.coordinates.getX() - c.getX())==1 && Math.abs(inf.coordinates.getY() - c.getY())==1){
                    System.out.println("Атака");
                }
                else {
                    int dX = inf.coordinates.getX() - c.getX();
                    int dY = inf.coordinates.getY() - c.getY();

                    if (Math.abs(dX) > Math.abs(dY)) {

                        X += Integer.compare(dX, 0);
                    } else {

                        Y += Integer.compare(dY, 0);
                    }

                    System.out.println("Infantry moves to (" + X + ", " + Y + ")");
                }
            }
        }
    }

}