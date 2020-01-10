package sample;

import java.util.ArrayList;

public class World {
    ArrayList<Character> characters;
    ArrayList<Country> countries;
    ArrayList<Location> locations;
    ArrayList<Species> species;

    public World() {
        characters = new ArrayList<>();
        locations = new ArrayList<>();
        countries = new ArrayList<>();
        species = new ArrayList<>();
    }

    public void addCharacter(String fName, String lName) {
        characters.add(new Character(fName, lName));
    }

    public void editCharacter(int index, int choice) {
        Character character = characters.get(index);
        /*
        1. Name
        2. Age
        3. BD
        4. Job
        5. Backstory
        6. Birthplace
        7. Relatives
        8. Species
         */
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
    }


    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public ArrayList<Species> getSpecies() {
        return species;
    }
}
