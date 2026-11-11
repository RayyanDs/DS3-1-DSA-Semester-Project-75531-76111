/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DSAProject;

/**
 *
 * @author MUHAMMAD RAYYAN
 */

public class Donation {

    private String donationID;
    private String foodName;
    private String category;
    private double quantity;
    private String unit;
    private String expiryDate;
    private String donorName;
    private String status;

    // Constructor
    public Donation(String donationID, String foodName,
                    String category, double quantity,
                    String unit, String expiryDate,
                    String donorName, String status) {

        this.donationID = donationID;
        this.foodName = foodName;
        this.category = category;
        this.quantity = quantity;
        this.unit = unit;
        this.expiryDate = expiryDate;
        this.donorName = donorName;
        this.status = status;
    }

    // Getters
    public String getDonationID() {
        return donationID;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getCategory() {
        return category;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getDonorName() {
        return donorName;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display donation details
    public void displayDonation() {
        System.out.println("Donation ID: " + donationID);
        System.out.println("Food Name: " + foodName);
        System.out.println("Category: " + category);
        System.out.println("Quantity: " + quantity + " " + unit);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Donor: " + donorName);
        System.out.println("Status: " + status);
    }
}

