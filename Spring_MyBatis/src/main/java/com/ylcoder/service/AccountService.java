package com.ylcoder.service;

import com.ylcoder.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 根据id查询一个
     * @param id
     * @return
     */
    public Account findOne(Integer id);

    /**
     * 保存
     * @param account
     */
    public void save(Account account);

    /**
     * 跟新
     * @param account
     */
    public void update(Account account);

    /**
     * 删除根据id
     * @param id
     */
    public void delet(Integer id);


}
