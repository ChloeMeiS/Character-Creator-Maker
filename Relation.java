package sample;

public class Relation {
    private Character characterA;
    private Character characterB;
    private RelationType relation;
    private String relationshipTidbit;

    public enum RelationType {
        FAMILY, FRIENDS, STRANGERS, LOVERS, DISLIKED, ENEMIES, UNKNOWN;
    }

    public Relation(Character characterA, Character characterB, RelationType relation) {
        this.characterA = characterA;
        this.characterB = characterB;
        this.relation = relation;
        relationshipTidbit = "Insert info about characters relation to each other";
    }

    public Relation(Character characterA, Character characterB) {
        this(characterA, characterB, RelationType.UNKNOWN);
    }

    public RelationType getRelation() {
        return relation;
    }

    public void setRelation(RelationType relation) {
        this.relation = relation;
    }

    public String getRelationshipTidbit() {
        return relationshipTidbit;
    }

    public void setRelationshipTidbit(String relationshipTidbit) {
        this.relationshipTidbit = relationshipTidbit;
    }
}
