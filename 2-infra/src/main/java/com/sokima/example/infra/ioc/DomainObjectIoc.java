package com.sokima.example.infra.ioc;

import com.sokima.example.app.usecase.DomainUseCase;
import com.sokima.example.domain.persistent.DomainObjectRepository;
import com.sokima.example.domain.service.DomainService;
import com.sokima.example.domain.service.impl.DomainServiceImpl;
import com.sokima.example.infra.adapter.in.DomainRestDrivingAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainObjectIoc {

    @Bean
    public DomainUseCase domainUseCase(final DomainService domainService, final DomainObjectRepository domainObjectRepository) {
        return new DomainUseCase(domainService, domainObjectRepository);
    }

    @Bean
    public DomainService domainService(final DomainObjectRepository domainObjectRepository) {
        return new DomainServiceImpl(domainObjectRepository);
    }
}
