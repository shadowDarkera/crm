package com.work.crm.dao;

import java.util.List;

import com.work.crm.domain.BaseDict;

/**
 * 字典DAO的接口
 * @author MRZHU
 *
 */
public interface BaseDictDao extends BaseDao<BaseDict>{

	List<BaseDict> findByTypeCode(String dict_type_code);
}
