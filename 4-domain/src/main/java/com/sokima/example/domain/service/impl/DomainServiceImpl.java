package com.sokima.example.domain.service.impl;

import com.sokima.example.domain.model.DomainObject;
import com.sokima.example.domain.persistent.DomainObjectRepository;
import com.sokima.example.domain.service.DomainService;

public final class DomainServiceImpl implements DomainService {
    private final DomainObjectRepository domainObjectRepository;

    public DomainServiceImpl(final DomainObjectRepository domainObjectRepository) {
        this.domainObjectRepository = domainObjectRepository;
    }

    @Override
    public DomainObject doDomainLogic(final DomainObject domainObject) {
        System.out.println("Do domain logic!!");
        return domainObjectRepository.save(domainObject);
    }
}
