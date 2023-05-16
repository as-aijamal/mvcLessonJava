package peaksoft.service;

import peaksoft.model.Company;

import java.util.List;

public interface CompanyService {

    void saveCompany(Company company);

    List<Company> getAllCompanies();

    Company getById(Long id);

    void deleteCompany(Long id);

    void updateCompany(Long id, Company company);
}
