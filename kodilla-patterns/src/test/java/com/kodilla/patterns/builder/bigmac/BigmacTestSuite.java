package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacCreator() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                        .bun("with sesame")
                        .burgers(2)
                        .ingredient("double cheddar cheese")
                        .sauce("extra spicy")
                        .ingredient("jalapeno")
                        .ingredient("slice of fresh tomato")
                        .ingredient("chopped onion")
                        .ingredient("slices of pickle")
                        .build();
        System.out.println(bigmac);
        //when
        int howManyIngredients = bigmac.getIngredients().size();
        String sauce = bigmac.getSauce();
        int burgers = bigmac.getBurgers();
        //then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals(2, burgers);
        Assert.assertEquals("extra spicy", sauce);
    }
}
