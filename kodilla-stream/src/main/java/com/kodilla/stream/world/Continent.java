package com.kodilla.stream.world;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public final class Continent {
    private final String continent;
    private final Set<Country> countrySet = new HashSet<>();

    public Continent(String continent) {
        this.continent = continent;
    }
    public String getContinent() {
        return continent;
    }
    public Set<Country> getCountrySet() {
        return countrySet;
    }
    public void addCountry(Country country) {
        countrySet.add(country);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent c = (Continent) o;
        return continent.equals(c.continent);
    }
    @Override
    public int hashCode() {
        return Objects.hash(continent);
    }
    @Override
    public String toString() {
        return "Continent{" +
                "continent = '" + continent + '\'' +
                '}';
    }
}
