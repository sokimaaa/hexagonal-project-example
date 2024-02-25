package com.sokima.example.app.usecase;

import com.sokima.example.domain.persistent.DomainObjectRepository;
import com.sokima.example.domain.service.DomainService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DomainUseCaseUnitTest {
    @InjectMocks DomainUseCase domainUseCase;

    @Mock DomainService domainService;

    @Mock DomainObjectRepository domainObjectRepository;

    @Test
    void doUseCase_nonNullCase_True() {
        // some test case
    }

    @Test
    void doUseCase_nullCase_False() {
        // some test case
    }

    @Test
    void doUseCase_noParameters_Error() {
        // some test case
    }
}