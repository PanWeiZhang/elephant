package com.youmias.elephant.service.impl;

import com.youmias.elephant.dao.UserContactMapper;
import com.youmias.elephant.po.UserContact;
import com.youmias.elephant.service.UserContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserContactServiceImpl implements UserContactService {

	@Autowired
	UserContactMapper userContactMapper;

	@Override
	public void insertUserContact(UserContact userContact) {
		userContactMapper.insert(userContact);
	}
}
