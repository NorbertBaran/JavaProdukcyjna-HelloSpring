package uj.jwzp2019.hellospring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {
    private String name;
    private long diameter;
    private String climate;
    private String terrain;
    private long population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDiameter() {
        return diameter;
    }

    public void setDiameter(long diameter){
        this.diameter=diameter;
    }

    @JsonProperty("diameter")
    public void setDiameter(String diameter) {
        if(diameter.equals("unknown"))
            this.diameter=0;
        else
            this.diameter = Long.parseLong(diameter);
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population){
        this.population=population;
    }

    @JsonProperty("population")
    public void setPopulation(String population) {
        if(population.equals("unknown"))
            this.population=0;
        else
            this.population = Long.parseLong(population);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                ", climate='" + climate + '\'' +
                ", terrain='" + terrain + '\'' +
                ", population=" + population +
                '}';
    }

}
