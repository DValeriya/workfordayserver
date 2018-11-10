package com.no.company.workfordayserver.entities;

import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity

public class Worker {

    @Id
    @GeneratedValue
    private long id;

    private Data date_start;
    private Data date_end;

    private double mark;
    private double price;
    private String review;

    @OneToOne
    @JoinColumn(name = "id_workers_request")
    private WorkersRequest workersRequest;

    public Data getDate_start() {
        return date_start;
    }

    public void setDate_start(Data date_start) {
        this.date_start = date_start;
    }

    public Data getDate_end() {
        return date_end;
    }

    public void setDate_end(Data date_end) {
        this.date_end = date_end;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public WorkersRequest getWorkersRequest() {
        return workersRequest;
    }

    public void setWorkersRequest(WorkersRequest workersRequest) {
        this.workersRequest = workersRequest;
    }

    public long getId() {
        return id;
    }
}
