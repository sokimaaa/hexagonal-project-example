package com.sokima.example.infra.adapter.in;

import com.sokima.example.app.usecase.DomainUseCase;
import com.sokima.example.domain.model.DomainObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class DomainRestDrivingAdapter {
    private final DomainUseCase domainUseCase;

    public DomainRestDrivingAdapter(final DomainUseCase domainUseCase) {
        this.domainUseCase = domainUseCase;
    }

    @PostMapping("/interact")
    public DomainObject interact() {
        return domainUseCase.doUseCaseLogic();
    }
}
