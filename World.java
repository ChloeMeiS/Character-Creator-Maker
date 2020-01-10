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

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<Species> getSpecies() {
        return species;
    }

    public void setSpecies(ArrayList<Species> species) {
        this.species = species;
    }
}
