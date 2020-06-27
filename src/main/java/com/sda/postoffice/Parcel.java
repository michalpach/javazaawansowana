package com.sda.postoffice;

import java.util.UUID;

public class Parcel {
    private String description;
    private String id;
    private ParcelStatus status;

    public Parcel(String description) {
        this.description = description;
        this.id = UUID.randomUUID().toString();
        this.status = ParcelStatus.SENT;
    }

    void changeStatus (ParcelStatus newStatus) {
        this.status = newStatus;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", status=" + status +
                '}';
    }
}