package com.mojdigital.backend.mvc;

public class ApplyResponse {
    private long id;

    public ApplyResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
