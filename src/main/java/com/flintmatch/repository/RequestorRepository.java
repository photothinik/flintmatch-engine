package com.flintmatch.repository;

import com.flintmatch.model.Requestor;

import java.sql.SQLException;
import java.util.List;

public interface RequestorRepository {

    List<Requestor> selectRequestors() throws SQLException;

    void createRequestor(Requestor p) throws SQLException;

    void updateRequestor(Requestor p) throws SQLException;

    void deleteRequestor(Requestor p) throws SQLException;

}
