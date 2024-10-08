package com.api.jobapp.company;

import java.util.List;

public interface CompanyService {

   void createCompany(Company company);

   List<Company> getAllCompanies();

   boolean updateCompany(Long id, Company company);

   boolean deleteCompanyById(Long id);

   Company getCompanyById(Long id);
}
