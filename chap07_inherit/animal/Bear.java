package chap07_inherit.animal;

public class Bear extends Animal {
	private boolean omnivore;
	private boolean likesHoney;
	private String habitat;
	private String species;
	
	public Bear(int age, int size, int legCnt,
			boolean hasWing, boolean omnivore, 
			boolean likesHoney, String habitat, 
			String species) {
		super(age, size, legCnt, hasWing);
		
	    this.omnivore = omnivore;
	    this.likesHoney = likesHoney;
	    this.habitat = habitat;
	    this.species = species;
	}

	public void eat() {
	    System.out.println("The bear is eating.");
	}

	public void hibernate() {
	    System.out.println("The bear is hibernating.");
	}

	public void swim() {
	    System.out.println("The bear is swimming.");
	}

	public boolean isOmnivore() {
	    return omnivore;
	}

	public boolean isLikesHoney() {
	    return likesHoney;
	}

	public String getHabitat() {
	    return habitat;
	}

	public String getSpecies() {
	    return species;
	}
}
