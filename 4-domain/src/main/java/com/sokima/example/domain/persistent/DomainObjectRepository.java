package com.sokima.example.domain.persistent;

import com.sokima.example.domain.model.DomainObject;

public interface DomainObjectRepository {
    DomainObject get();

    DomainObject save(final DomainObject domainObject);
}
