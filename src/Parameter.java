import java.util.ArrayList;
public abstract class Parameter implements ParamInterface {
    Coordinates coordinates;
    int initiative;
    String name;
    protected Boolean Health;
    protected Integer Arrows;
    Parameter(String name,Coordinates coordinates,int initiative,Boolean Health,Integer Arrows){
        this.name=name;
        this.coordinates=coordinates;
        this.initiative= initiative;
        this.Arrows=Arrows;
        this.Health = Health;
    }
    public Boolean getHealth(){
        return Health;
    }
    public Integer getArrows(){
        return Arrows;
    }
    public int getInitiative(){
        return initiative;
    }
    @Override
    public String toString() {
        return "Имя: " + name + ", Координаты: " + coordinates;
    }
    @Override
    public void step(ArrayList<Parameter> darkTeam, ArrayList<Parameter> holyTeam) {
        // Реализация метода step
    }
    public String getInfo(){
        String s = name+coordinates+Health;
        return s;
    }
    enum  Names{
        Vanya, Igor ,Sasha ,Artem, Nikita, Marat, Sergey ,Tom, Mark, Miron, Danil ,Andrey ,Zhenya;
    }
}