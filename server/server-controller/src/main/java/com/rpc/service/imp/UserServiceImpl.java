package com.rpc.service.imp;


import com.common.model.Result;
import com.common.pojo.User;
import com.common.pojo.UserExample;
import com.genaratexml.UserMapper;
import com.qiangge.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

	@Autowired
	UserMapper userMapper;


	@Override
	public Result login(String ip, String account, String password) {
		return null;
	}

	@Override
	public void enable(Boolean isEnable, List<Integer> idList) {

	}

	@Override
	public void resetPassword(String password, List<Integer> idList) {

	}

	@Override
	public User findByAccount(String account) {
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria=userExample.createCriteria();
		criteria.andAccountEqualTo(account);
		User user=userMapper.selectByExample(userExample).get(0);
		return user;
	}

	@Override
	public void updatePassword(Integer id, String newPassword) {

	}

	@Override
	public void save(User user, List<Integer> roleIdList) {

	}
}
