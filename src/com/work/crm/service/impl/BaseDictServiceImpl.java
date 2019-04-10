package com.work.crm.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.work.crm.dao.BaseDictDao;
import com.work.crm.domain.BaseDict;
import com.work.crm.service.BaseDictService;
@Transactional
public class BaseDictServiceImpl implements BaseDictService {
	//注入DAO
	private BaseDictDao baseDictDao;

	public void setBaseDictDao(BaseDictDao baseDictDao) {
		this.baseDictDao = baseDictDao;
	}

	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		return baseDictDao.findByTypeCode(dict_type_code);
	}
	
}
