package com.no.company.workfordayserver.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "Workers_request")

public class WorkersRequest {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_user");
    private User user;


    @ManyToOne
    @JoinColumn(name = "id_vacancy");
    private Vacancy vacancy;

    private double price;
    public enum State_request {Statement, Approved, Rejected};
    private State_request state_request;

    @OneToOne(mappedBy = "Works_request")
    private Hold_payments hold_payments;

    @OneToOne(mappedBy = "Workers_request")
    private Worker worker;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public State_request getState_request() {
        return state_request;
    }

    public void setState_request(State_request state_request) {
        this.state_request = state_request;
    }

    public Hold_payments getHold_payments() {
        return hold_payments;
    }

    public void setHold_payments(Hold_payments hold_payments) {
        this.hold_payments = hold_payments;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public long getId() {
        return id;
    }
}
