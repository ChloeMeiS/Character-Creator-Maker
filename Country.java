package sample;

public class Country extends Location {
    private String capital;
    private String language;
    private boolean metricType; //false for Imperial, true for metric
    private int population;
    public Country(String name) {
        super(name);
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isMetricType() {
        return metricType;
    }

    public void setMetricType(boolean metricType) {
        this.metricType = metricType;
    }
}
