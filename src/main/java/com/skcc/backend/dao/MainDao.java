package com.skcc.backend.dao;

/**
 * This is automatically generated by sprout plug-in.
 */

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skcc.backend.controller.MainController;

@Repository("mainDao")
public class MainDao {

	private Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	/**
	*getTemplate
	*
	*@return
	*throws Exception
	*/
	public List<Map<String, Object>> getTemplate() throws Exception {
		try {
			return sqlSessionTemplate.selectList("template.daoQueryId");
		} catch (Exception e) {
			logger.error(">>>>>>>>>>> MyBatis Test Error Dao");
			throw new Exception("MyBatis Test Error Dao");
		}
	}
}