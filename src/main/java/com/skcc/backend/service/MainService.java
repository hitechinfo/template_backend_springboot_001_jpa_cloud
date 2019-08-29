package com.skcc.backend.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.skcc.backend.common.data.jpa.entity.TemplateAuth;
import com.skcc.backend.common.data.jpa.repository.TemplateAuthRepository;

@Service("mainService")
public class MainService {

	private Logger logger = LoggerFactory.getLogger(MainService.class);

	@Autowired
	TemplateAuthRepository templateAuthRepository;

	/**
	* getTemplateJpa
	*
	* @return
	* @throws Exception
	*/
	
	public void getTemplateJpa() throws Exception {
		TemplateAuth templateAuthSearch = new TemplateAuth();
		Optional<TemplateAuth> userInfo = templateAuthRepository.findByAuthUserId("admin");
//		templateAuthSearch = userInfo.orElseThrow(() -> new Exception("Exception admin Error!"));
		templateAuthSearch = userInfo.orElseThrow(() -> new UsernameNotFoundException("Exception admin Error!"));
		logger.info("Hello World!-getTemplateJpa-getAuthUserType>>>>>>>>{}", templateAuthSearch.getAuthUserType());
	}

}
