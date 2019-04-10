package com.work.crm.service;

import java.util.List;

import com.work.crm.domain.BaseDict;

public interface BaseDictService {

	List<BaseDict> findByTypeCode(String dict_type_code);

}
