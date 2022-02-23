public class Address {
  private String postalCode;
  private String streetName;
  private String city;
  private String buildingNumber;

  public Address(
                String postalCode,
                String streetName,
                String city,
                String buildingNumber) {
    this.postalCode = postalCode;
    this.streetName = streetName;
    this.city = city;
    this.buildingNumber = buildingNumber;
  }
}
