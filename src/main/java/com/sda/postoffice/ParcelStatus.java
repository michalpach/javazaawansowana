package com.sda.postoffice;

enum ParcelStatus {
    SENT("Wysłane", 111),
    TRAVELLING("W drodze", 222),
    COURIER("U kuriera", 333),
    DELIVERED("Dostarczone", 444),
    LOST("Zgubione", 555),
    RETURNED("Zwrócone", 666);

    private final String message;
    private final int code;

    ParcelStatus (String message, int code) {
        this.message=message;
        this.code=code;

    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ParcelStatus{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}