package model;

public class Address {

    private String streetName;
    private String buildingNo;
    private String flatNo;
    private String town;
    private String zipCode;
    private String region;


    public Address() {
        this("street", "city", "zip-code","region" );
    }

    public Address(String streetName, String town, String zipCode, String region) {
        this(streetName,"none", "none", town, zipCode, region);
    }

    public Address(String streetName, String buildingNo, String flatNo, String town, String zipCode, String region) {
        this.streetName = streetName;
        this.buildingNo = buildingNo;
        this.flatNo = flatNo;
        this.town = town;
        this.zipCode = zipCode;
        this.region = region;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", buildingNo='" + buildingNo + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", town='" + town + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
