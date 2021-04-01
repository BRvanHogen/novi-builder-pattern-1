package nl.novi.dpcc.builder.domain;

public class House {
    private String streetName;
    private int houseNumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;

    public House(String streetName, int houseNumber, String houseNumberAddition, String postalCode, String province, boolean hasGarden) {
    }
}
