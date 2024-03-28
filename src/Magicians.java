import java.util.ArrayList;

public class Magicians extends Parameter{
    public Magicians (String name,Coordinates coordinates,Boolean Health,Integer Arrows){
        super(name,coordinates,1,Health,Arrows);

    }
    public void step(ArrayList<Parameter> darkTeam, ArrayList<Parameter> holyTeam){

    }
    @Override
    public String getInfo() {
        String s = name+"Координаты :"+coordinates+"жив"+getHealth()+"количество стрел"+getArrows();
    return s;
    }
}