package sample;

import java.util.ArrayList;

public class Character {
    private int age;
    private String backstory;
    private Location birthPlace;
    private Time birthday;
    private String career;
    private String fName;
    private Character father;
    private String gender;
    private String lName;
    private String mName;
    private Character mother;
    private ArrayList<Relation> relations;
    private Species species;
    private ArrayList<String> traits;

    public Character() {
        this("J", "Doe");
    }

    public Character(String fName, String lName) {
        this(0,"",new Location("NA"), new Time(Time.Month.JAN, 1, 2000),"NA",fName,null,lName,"",null,new Species());
    }

    private Character(int age, String backstory, Location birthPlace, Time birthday, String career, String fName,
                Character father, String lName, String mName, Character mother, Species species) {
        this.age = age;
        this.backstory = backstory;
        this.birthPlace = birthPlace;
        this.birthday = birthday;
        this.career = career;
        this.fName = fName;
        this.father = father;
        this.lName = lName;
        this.mName = mName;
        this.mother = mother;
        this.species = species;
    }

    public void addRelation(Character characterA, Character characterB, Relation.RelationType relationType) {
        relations.add(new Relation(characterA, characterB, relationType));
    }

    public void addTrait(String trait) {
        traits.add(trait);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public Location getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Location birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Time getBirthday() {
        return birthday;
    }

    public void setBirthday(Time birthday) {
        this.birthday = birthday;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Character getFather() {
        return father;
    }

    public void setFather(Character father) {
        this.father = father;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Character getMother() {
        return mother;
    }

    public void setMother(Character mother) {
        this.mother = mother;
    }

    public ArrayList<Relation> getRelations() {
        return relations;
    }

    public void setRelations(ArrayList<Relation> relations) {
        this.relations = relations;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public ArrayList<String> getTraits() {
        return traits;
    }

    public void setTraits(ArrayList<String> traits) {
        this.traits = traits;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

}
