public class Reformatory {
    private int measure_count = 0;
    
    public Reformatory() {
        this.measure_count = 0;
    }
    
    public int weight(Person person) {
        // return the weight of the person
        this.measure_count++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.measure_count;
    }
}
