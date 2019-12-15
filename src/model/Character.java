package model;

public class Character {

	private String name;
	private Integer id, strength, age, constitution, dexterity, intelligence, wisdom, charisma;
	
	public Character() {
		super();
	}

	public Character(String name, Integer id, Integer strength, Integer age, Integer constitution, Integer dexterity,
			Integer intelligence, Integer wisdom, Integer charisma) {
		super();
		this.name = name;
		this.id = id;
		this.strength = strength;
		this.age = age;
		this.constitution = constitution;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getConstitution() {
		return constitution;
	}

	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}

	public Integer getDexterity() {
		return dexterity;
	}

	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getWisdom() {
		return wisdom;
	}

	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}

	public Integer getCharisma() {
		return charisma;
	}

	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", id=" + id + ", strength=" + strength + ", age=" + age + ", constitution="
				+ constitution + ", dexterity=" + dexterity + ", intelligence=" + intelligence + ", wisdom=" + wisdom
				+ ", charisma=" + charisma + "]";
	}
	
	
}
