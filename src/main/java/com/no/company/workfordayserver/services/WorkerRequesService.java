package com.no.company.workfordayserver.services;

import com.no.company.workfordayserver.entities.WorkersRequest;
import com.no.company.workfordayserver.repos.WorkerRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkerRequesService {

    @Autowired
    WorkerRequestRepository repository;

    public void addWorkerRequest (WorkersRequest workersRequest) {
        repository.save(workersRequest);
    }
}
