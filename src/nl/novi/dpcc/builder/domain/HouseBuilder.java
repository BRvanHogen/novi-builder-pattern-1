package nl.novi.dpcc.builder.domain;

public class HouseBuilder {
    //same instance variables as class House
    private String streetName;
    private int houseNumber;
    private String houseNumberAddition;
    private String postalCode;

    //    //Niet verplicht
    private String province;
    private boolean hasGarden;


    //empty constructor
    public HouseBuilder() {
    }

    //-----------------------------------builder methods----------------------------------------------------------------*****
    public HouseBuilder withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public HouseBuilder withHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public HouseBuilder withHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilder withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilder withProvince(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilder withHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }
//-----------------------------build method----------------------------------------------------------

    public House buildWithEmptyCheck() {
        if (streetName.equalsIgnoreCase("") || houseNumber == 0 ||
                houseNumberAddition.equalsIgnoreCase("") ||
                postalCode.equalsIgnoreCase("")) {
            throw new RuntimeException("field mandatory");
        }
        return new House(streetName, houseNumber, houseNumberAddition, postalCode, province, hasGarden);
    }
}
