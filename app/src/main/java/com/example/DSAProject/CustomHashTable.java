/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DSAProject;

/**
 *
 * @author MUHAMMAD RAYYAN
 */

public class CustomHashTable {

    private static class Node {

        String key;
        Object value;
        Node next;

        Node(String key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] table;
    private int size;

    // Constructor
    public CustomHashTable(int capacity) {
        table = new Node[capacity];
        size = 0;
    }

    // Hash function
    private int hash(String key) {
        int hashValue = 0;

        for (int i = 0; i < key.length(); i++) {
            hashValue = hashValue + key.charAt(i);
        }

        return hashValue % table.length;
    }

    // Insert a new record
    public void insert(String key, Object value) {

        int index = hash(key);

        Node current = table[index];

        // Update value if key already exists
        while (current != null) {

            if (current.key.equals(key)) {
                current.value = value;
                return;
            }

            current = current.next;
        }

        // Insert new node at the beginning
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;

        size++;
    }

    // Search for a record
    public Object search(String key) {

        int index = hash(key);

        Node current = table[index];

        while (current != null) {

            if (current.key.equals(key)) {
                return current.value;
            }

            current = current.next;
        }

        return null;
    }

    // Delete a record
    public boolean delete(String key) {

        int index = hash(key);

        Node current = table[index];
        Node previous = null;

        while (current != null) {

            if (current.key.equals(key)) {

                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                size--;
                return true;
            }

            previous = current;
            current = current.next;
        }

        return false;
    }

    // Return number of records
    public int getSize() {
        return size;
    }

    // Display all records
    public void display() {

        for (int i = 0; i < table.length; i++) {

            System.out.print("Index " + i + ": ");

            Node current = table[i];

            while (current != null) {

                System.out.print("[" + current.key + "] -> ");
                current = current.next;
            }

            System.out.println("null");
        }
    }
}

