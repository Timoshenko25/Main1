public abstract class Parameter implements ParamInterface {

    Coordinates coordinates;
    int initiative;
    Parameter(Coordinates coordinates,int initiative){

        this.coordinates=coordinates;
        this.initiative= initiative;
    }
    @Override
    public String toString() {
        return " Координаты: " + coordinates;
    }
    @Override
    public void step(Teams teams) {
        // Реализация метода step
    }
}