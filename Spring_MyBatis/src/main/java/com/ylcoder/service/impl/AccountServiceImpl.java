package com.ylcoder.service.impl;

import com.ylcoder.dao.AccountDao;
import com.ylcoder.domain.Account;
import com.ylcoder.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findOne(Integer id) {
        return accountDao.findOne(id);
    }

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public void delet(Integer id) {
        accountDao.delet(id);
    }
}
