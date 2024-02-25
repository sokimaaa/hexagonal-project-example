package com.sokima.example.app.usecase;

import com.sokima.example.domain.model.DomainObject;
import com.sokima.example.domain.persistent.DomainObjectRepository;
import com.sokima.example.domain.service.DomainService;

public final class DomainUseCase {
    private final DomainService domainService;
    private final DomainObjectRepository domainObjectRepository;

    public DomainUseCase(final DomainService domainService, final DomainObjectRepository domainObjectRepository) {
        this.domainService = domainService;
        this.domainObjectRepository = domainObjectRepository;
    }

    public DomainObject doUseCaseLogic() {
        System.out.println("Do use case logic!!");
        final DomainObject domainObject = domainObjectRepository.get();
        return domainService.doDomainLogic(domainObject);
    }
}
