package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //given
        Country poland = new Country("Poland", new BigDecimal("2193698"));
        Country france = new Country("France", new BigDecimal("98635267"));
        Country london = new Country("London", new BigDecimal("542747332"));
        Country sydney = new Country("Sydney", new BigDecimal("723645637"));
        Country melbourne = new Country("Melbourne", new BigDecimal("82396237"));
        Country canberra = new Country("Canberra", new BigDecimal("13241999"));
        Country lagos = new Country("Lagos", new BigDecimal("726372"));
        Country cairo = new Country("Cairo", new BigDecimal("6653929"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(london);

        Continent australia = new Continent("Australia");
        australia.addCountry(sydney);
        australia.addCountry(melbourne);
        australia.addCountry(canberra);

        Continent africa = new Continent("Africa");
        africa.addCountry(lagos);
        africa.addCountry(cairo);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(australia);
        world.addContinent(africa);

        //when
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("1470240471");

        //then
        Assert.assertEquals(expected, result);
    }
}
