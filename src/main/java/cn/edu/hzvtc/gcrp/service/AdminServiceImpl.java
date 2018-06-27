package cn.edu.hzvtc.gcrp.service;

import cn.edu.hzvtc.gcrp.base.BaseServiceImpl;
import cn.edu.hzvtc.gcrp.dao.AdminDao;
import cn.edu.hzvtc.gcrp.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author : tao
 * @date : 2018-06-27 11:31
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService {

    @Autowired
    public AdminServiceImpl(AdminDao adminDao) {
        super(adminDao);
    }
}
