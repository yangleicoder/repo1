package com.ylcoder.dao;

import com.ylcoder.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 根据id查询一个
     * @param id
     * @return
     */
    @Select("select * from account where id=#{id}")
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
