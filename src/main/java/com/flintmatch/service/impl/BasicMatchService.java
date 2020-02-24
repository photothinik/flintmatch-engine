package com.flintmatch.service.impl;

import com.flintmatch.model.Match;
import com.flintmatch.model.Provider;
import com.flintmatch.model.Requestor;
import com.flintmatch.repository.ProviderRepository;
import com.flintmatch.repository.RequestorRepository;
import com.flintmatch.service.MatchSearchException;
import com.flintmatch.service.MatchService;

public class BasicMatchService implements MatchService {

    private ProviderRepository providerRepository;
    private RequestorRepository requestorRepository;

    public BasicMatchService(ProviderRepository providerRepository, RequestorRepository requestorRepository) {
        this.providerRepository = providerRepository;
        this.requestorRepository = requestorRepository;
    }

    public Match search(Provider p) throws MatchSearchException {
        throw new MatchSearchException("Not implemented");
    }

    public Match search(Requestor r) throws MatchSearchException {
        throw new MatchSearchException("Not implemented");
    }
}
