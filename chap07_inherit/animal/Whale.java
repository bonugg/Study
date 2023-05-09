package chap07_inherit.animal;

public class Whale extends Animal {
    private String food;
    private String habitat;
    private String species;
    private int teeth;
    private int offspring;

    public Whale(int age, int size, int legCnt, boolean hasWing,
    		String food, String habitat, String species, int teeth, int offspring) {
        super(age, size, legCnt, hasWing);
    	
    	this.food = food;
        this.habitat = habitat;
        this.species = species;
        this.teeth = teeth;
        this.offspring = offspring;
    }

    public void eat() {
        System.out.println("고래가 " + food + "을/를 먹습니다.");
    }

    public void sprayWater() {
        System.out.println("고래가 물을 뿜습니다.");
    }

    public void swimInPod() {
        System.out.println("고래가 무리지어 다닙니다.");
    }

    // getter 및 setter 메서드
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getOffspring() {
        return offspring;
    }

    public void setOffspring(int offspring) {
        this.offspring = offspring;
    }
}

