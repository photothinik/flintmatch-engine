package com.flintmatch.service;

import com.flintmatch.model.Match;
import com.flintmatch.model.Provider;
import com.flintmatch.model.Requestor;

public interface MatchService {

    Match search(Provider p) throws MatchSearchException;

    Match search(Requestor r) throws MatchSearchException;

}
