import java.util.ArrayList;
import java.util.List;
public class Teams {
    String name;
    private List<Parameter> param;
    public Teams(String name){
        this.name=name;
        this.param =new ArrayList<>();
    }
    public void addParameter(Parameter param1){
        this.param.add(param1);
    }
    public List<Parameter> getTeams(){
        return param;
    }


    public void remove(Parameter param) {
        this.param.remove(param);
    }
}
