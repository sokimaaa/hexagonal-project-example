package com.sokima.example.domain.service.impl;

import com.sokima.example.domain.persistent.DomainObjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DomainServiceImplUnitTest {
    @InjectMocks DomainServiceImpl domainServiceImpl;

    @Mock DomainObjectRepository domainObjectRepository;

    @Test
    void doDomainLogic_nonNullCase_True() {
        // some test case
    }

    @Test
    void doDomainLogic_nullCase_True() {
        // some test case
    }

    @Test
    void doDomainLogic_noParameters_Error() {
        // some test case
    }
}
