package com.individual.paternity_test_system;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Age")
	private int age;
	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Gender")
	private String gender;
	@org.kie.api.definition.type.Label("Height")
	private double height;
	@org.kie.api.definition.type.Label("Weight")
	private double weight;
	@org.kie.api.definition.type.Label("Blood Type")
	private java.lang.String bloodType;
	@org.kie.api.definition.type.Label("Hair Color")
	private java.lang.String hairColor;
	@org.kie.api.definition.type.Label("Is Alive")
	private boolean isAlive;
	@org.kie.api.definition.type.Label("Has Genetic Disease")
	private boolean hasGeneticDisease;

	public Person() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public java.lang.String getBloodType() {
		return this.bloodType;
	}

	public void setBloodType(java.lang.String bloodType) {
		this.bloodType = bloodType;
	}

	public java.lang.String getHairColor() {
		return this.hairColor;
	}

	public void setHairColor(java.lang.String hairColor) {
		this.hairColor = hairColor;
	}

	public boolean isIsAlive() {
		return this.isAlive;
	}

	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isHasGeneticDisease() {
		return this.hasGeneticDisease;
	}

	public void setHasGeneticDisease(boolean hasGeneticDisease) {
		this.hasGeneticDisease = hasGeneticDisease;
	}

	public java.lang.String getGender() {
		return this.gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public Person(int age, java.lang.String name, java.lang.String gender,
			double height, double weight, java.lang.String bloodType,
			java.lang.String hairColor, boolean isAlive,
			boolean hasGeneticDisease) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
		this.hairColor = hairColor;
		this.isAlive = isAlive;
		this.hasGeneticDisease = hasGeneticDisease;
	}

}