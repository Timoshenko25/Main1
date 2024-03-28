import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public List<Parameter> sortTeam() {
        Teams team = null;
        List<Parameter> sortedList = new ArrayList<>(team.getTeams());
        Collections.sort(sortedList, new Comparator<Parameter>() {
            @Override
            public int compare(Parameter p1, Parameter p2) {
                return Integer.compare(p1.getInitiative(), p2.getInitiative());
            }
        });
        return sortedList;
    }

    public void remove(Parameter param) {
        this.param.remove(param);
    }
}
