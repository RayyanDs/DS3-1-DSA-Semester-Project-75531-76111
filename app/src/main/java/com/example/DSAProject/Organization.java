/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DSAProject;

/**
 *
 * @author MUHAMMAD RAYYAN
 */

public class Organization {

    private String organizationID;
    private String organizationName;
    private String address;
    private String contactNumber;

    // Constructor
    public Organization(String organizationID, String organizationName,
                        String address, String contactNumber) {

        this.organizationID = organizationID;
        this.organizationName = organizationName;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getOrganizationID() {
        return organizationID;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // Display organization details
    public void displayOrganization() {
        System.out.println("Organization ID: " + organizationID);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }
}
