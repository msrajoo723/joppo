package com.raju.portal.front.controller.service;

import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.portal.front.controller.repository.AddressRepository;
import com.raju.portal.front.controller.repository.CompanyRepository;
import com.raju.portal.front.controller.repository.JobInfoRepository;
import com.raju.portal.front.controller.repository.PaymentRepository;
import com.raju.portal.front.entity.Address;
import com.raju.portal.front.entity.Company;
import com.raju.portal.front.entity.JobInfo;
import com.raju.portal.front.entity.Payment;
import com.raju.portal.front.vo.CompanyRequest;

@Service
public class CompanyService {

	private ModelMapper modelMapper = new ModelMapper();
	
	 @Autowired
	private CompanyRepository companyRepo;
	
	@Autowired
	private JobInfoRepository jobRepo;
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private PaymentRepository paymentRepo;

	public Optional<Company> getCompanyInfo(Long companyId) throws Exception {
		return companyRepo.findById(companyId);
	}

	public Iterable<Company> getCompanies() {
		return companyRepo.findAll();
	}

	@Transactional
	public Company saveCompanyDetails(CompanyRequest companyRequest) {
		Company companyDetails = modelMapper.map(companyRequest, Company.class);
		if(null != companyDetails.getJobnotifications()) {
			Company savedCompanyDetails = companyRepo.save(companyDetails);

			if(null == savedCompanyDetails){
				return savedCompanyDetails;
			}
			
			Set<JobInfo> jobNotifications = companyDetails.getJobnotifications();
			if(null != jobNotifications) {
				Iterator<JobInfo> itr = jobNotifications.iterator(); 
				while (itr.hasNext()) {
					JobInfo jInfo = itr.next();
					jInfo.setCompany(savedCompanyDetails);
					jobRepo.save(jInfo);
				}
			}
			
			Set<Address> addresses = companyDetails.getAddresses();
			if(null != addresses) {
				Iterator<Address> addressItr = addresses.iterator(); 
				while (addressItr.hasNext()) {
					Address address = addressItr.next();
					address.setCompany(savedCompanyDetails);
					addressRepo.save(address);
				}
			}
						
			Set<Payment> payments = companyDetails.getPayments();
			if(null != payments) {
				Iterator<Payment> paymentItr = payments.iterator(); 
				while (paymentItr.hasNext()) {
					Payment payment = paymentItr.next();
					payment.setCompany(savedCompanyDetails);
					paymentRepo.save(payment);
				}
			}
			return savedCompanyDetails;
		}
		return null;
	}

	public void deleteCompany(Long id) {
		companyRepo.deleteById(id);
	}
}
