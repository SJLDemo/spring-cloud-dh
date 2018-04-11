package com.right.rightserver.service.imp;

import com.right.rightserver.dao.CompanyDao;
import com.right.rightserver.dao.RoleDao;
import com.right.rightserver.dao.UserDao;
import com.right.rightserver.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RightServiceImp implements RightService {
    @Override
    public void register() {
        CompanyDao.saveCompany();
        UserDao.saveUser();
        RoleDao.saveRole();
    }
}
