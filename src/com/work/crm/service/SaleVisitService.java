package com.work.crm.service;

import org.hibernate.criterion.DetachedCriteria;

import com.work.crm.domain.PageBean;
import com.work.crm.domain.SaleVisit;

public interface SaleVisitService {

	PageBean<SaleVisit> findByPage(DetachedCriteria detachedCriteria,
			Integer currPage, Integer pageSize);

	void save(SaleVisit saleVisit);
	
}
