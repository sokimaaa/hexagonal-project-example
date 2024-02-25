package com.sokima.example.infra.adapter.out;

import com.sokima.example.domain.model.DomainObject;
import com.sokima.example.domain.persistent.DomainObjectRepository;
import org.springframework.stereotype.Repository;

@Repository
public final class DomainPersistentDrivenAdapter implements DomainObjectRepository {
    public DomainObject get() {
        // some communication with database
        return new DomainObject();
    }

    public DomainObject save(final DomainObject domainObject) {
        // some communication with database
        return domainObject;
    }
}
