/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DSAProject;

/**
 *
 * @author MUHAMMAD RAYYAN
 */

public class FoodRequest {

    private String requestID;
    private String organizationID;
    private String foodCategory;
    private double requestedQuantity;
    private double allocatedQuantity;
    private String requestDate;
    private int priority;
    private String status;

    // Constructor
    public FoodRequest(String requestID, String organizationID,
                       String foodCategory, double requestedQuantity,
                       String requestDate, int priority) {

        this.requestID = requestID;
        this.organizationID = organizationID;
        this.foodCategory = foodCategory;
        this.requestedQuantity = requestedQuantity;
        this.allocatedQuantity = 0;
        this.requestDate = requestDate;
        this.priority = priority;
        this.status = "Pending";
    }

    // Getters
    public String getRequestID() {
        return requestID;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public double getRequestedQuantity() {
        return requestedQuantity;
    }

    public double getAllocatedQuantity() {
        return allocatedQuantity;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setAllocatedQuantity(double allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Calculate remaining requested quantity
    public double getRemainingQuantity() {
        return requestedQuantity - allocatedQuantity;
    }

    // Display request details
    public void displayRequest() {
        System.out.println("Request ID: " + requestID);
        System.out.println("Organization ID: " + organizationID);
        System.out.println("Food Category: " + foodCategory);
        System.out.println("Requested Quantity: " + requestedQuantity);
        System.out.println("Allocated Quantity: " + allocatedQuantity);
        System.out.println("Remaining Quantity: " + getRemainingQuantity());
        System.out.println("Request Date: " + requestDate);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
    }
}
