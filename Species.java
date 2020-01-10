package sample;

public class Species {
    private int avgAge;
    private boolean hasPowers;
    private String name;
    private String speciesDesc;
    private SpeciesType speciesType;

    public enum SpeciesType {
        HUMAN, ARTIFICIAL_HUMAN, SUB_HUMAN;
    }

    public Species() {
        this("Human");
    }

    public Species(String name) {
        this.name = name;
        this.speciesType = SpeciesType.HUMAN;
        this.avgAge = 80;
        this.hasPowers = false;
        this.speciesDesc = "Desc of Species Here";
    }

    public int getAvgAge() {
        return avgAge;
    }

    public void setAvgAge(int avgAge) {
        this.avgAge = avgAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciesDesc() {
        return speciesDesc;
    }

    public void setSpeciesDesc(String speciesDesc) {
        this.speciesDesc = speciesDesc;
    }

    public SpeciesType getSpeciesType() {
        return speciesType;
    }

    public void setSpeciesType(SpeciesType speciesType) {
        this.speciesType = speciesType;
    }

    public boolean isHasPowers() {
        return hasPowers;
    }

    public void setHasPowers(boolean hasPowers) {
        this.hasPowers = hasPowers;
    }
}
