package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.House;
import nl.novi.dpcc.builder.domain.HouseBuilder;

public class Main {

    public static void main(String[] args) {
    //I chose empty constructor, so:
        House vinex = new HouseBuilder().
                withStreetName("Laan van Modaal").
                withHouseNumber(23).withHouseNumberAddition("hs").
                withPostalCode("4587HV").buildWithEmptyCheck();
    }
}
