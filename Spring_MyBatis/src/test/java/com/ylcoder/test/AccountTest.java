package com.ylcoder.test;
import com.ylcoder.domain.Account;
import com.ylcoder.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountTest {
    @Autowired//按照类型注入
    private AccountServiceImpl accountServiceImpl;

    @Test
    public void testFindOne(){

        Account one= accountServiceImpl.findOne(4);
        System.out.println(one);

    }

    @Test
    public void testFindAll(){

        List<Account> all = accountServiceImpl.findAll();
        for(Account account :all){
            System.out.println(account);
        }

    }

    @Test
    public void testsave(){
        Account account=new Account();
        account.setMoney(2000.);
        account.setName("laowang");
        accountServiceImpl.save(account);
    }
}
