package com.flintmatch.repository;

import com.flintmatch.model.Provider;

import java.sql.SQLException;
import java.util.List;

public interface ProviderRepository {

    List<Provider> selectProviders() throws SQLException;

    void createProvider(Provider p) throws SQLException;

    void updateProvider(Provider p) throws SQLException;

    void deleteProvider(Provider p) throws SQLException;

}
