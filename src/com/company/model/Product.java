package com.company.model;


import java.util.ArrayList;

    public class Product {
        private String productId;
        private Processes processes;
        private String Name;
        private String brandOrCompany;
        private double cast;
        private Customer customer;
        private Category category;
        private String description;
        private double averageScore;
        private ArrayList<Comment> comments;
        private InventoryStatus inventoryStatus;
        private String number;

        public Product(String productId, String name, String brandOrCompany, double cast, Category category, String explanation,String number) {
            this.productId = productId;
            Name = name;
            this.brandOrCompany = brandOrCompany;
            this.cast = cast;
            this.category = category;
            this.description = explanation;
            this.number=number;
        }

        public void setProcesses(Processes processes) {
            this.processes = processes;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setBrandOrCompany(String brandOrCompany) {
            this.brandOrCompany = brandOrCompany;
        }

        public void setCast(double cast) {
            this.cast = cast;
        }

        public void setCostumer(Customer buyer) {
            this.customer = buyer;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setAverageScore(double averageScore) {
            this.averageScore = averageScore;
        }

        public void setComments(ArrayList<Comment> comments) {
            this.comments = comments;
        }

        public void setInventoryStatus(InventoryStatus inventoryStatus) {
            this.inventoryStatus = inventoryStatus;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductId() {
            return productId;
        }

        public Processes getProcesses() {
            return processes;
        }

        public String getName() {
            return Name;
        }

        public String getBrandOrCompany() {
            return brandOrCompany;
        }

        public double getCast() {
            return cast;
        }

        public Customer getCustomer() {
            return customer;
        }

        public Category getCategory() {
            return category;
        }

        public String getDescription() {
            return description;
        }

        public double getAverageScore() {
            return averageScore;
        }

        public ArrayList<Comment> getComments() {
            return comments;
        }

        public InventoryStatus getInventoryStatus() {
            return inventoryStatus;
        }

        public static String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
