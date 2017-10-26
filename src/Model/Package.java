package Model;

import java.io.Serializable;

public class Package implements Serializable {
   private int packageID;
   private String arrivalTime;
   private String name;
   private String address;
   private String city;
   private String county;
   private String contactNumber;
   private String description;
   private double price;
   private boolean prePaid;
   
   public Package(int packageID, String arrivalTime, String name, 
        String address, String city, String county, String contactNumber, 
        String description, double price, boolean prePaid) 
   {
      this.packageID = packageID;
      this.arrivalTime = arrivalTime;
      this.name = name;
      this.address = address;
      this.city = city;
      this.county = county;
      this.contactNumber = contactNumber;
      this.description = description;
      this.price = price;
      this.prePaid = prePaid;
   }
  
    public void updatePackage(String name, String address,
        String city, String county, String contactNumber,
        String description, double price, boolean prePaid)
    {
        this.setName(name);
        this.setAddress(address);
        this.setCity(city);
        this.setCounty(county);
        this.setContactNumber(contactNumber);
        this.setPrice(price);
        this.setDescription(description);
        this.setPrePaid(prePaid);
    }  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPrePaid() {
        return prePaid;
    }

    public void setPrePaid(boolean prePaid) {
        this.prePaid = prePaid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    @Override
    public String toString() {
        return "Package ID: " + this.getPackageID()+
               "\nPackage Arrived At: " + this.getArrivalTime() +
               "\nCustomer Name: " + this.getName() +
               "\nAddress: " + this.getAddress() +
               "\nCity: " + this.getCity() +
               "\nCounty: " + this.getCounty() +
               "\nContact Number: " + this.getContactNumber() +
               "\nProduct Description: " + this.getDescription() +
               "\nPrice: €" + this.getPrice() +
               "\nPrepaid: " + this.isPrePaid();
    }
}    

