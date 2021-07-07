package com.atjh.demomptest;

import com.atjh.demomptest.entity.User;
import com.atjh.demomptest.mapper.UserMapper;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemomptestApplicationTests {


    @Autowired
    private UserMapper userMapper;

    //修改
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1412697892593876993L);
        user.setName("lucyMaaaa");
        int count = userMapper.updateById(user);
        System.out.println(count);

    }


    //添加
    @Test
    public void testAdd() {
        User user = new User();
        user.setName("lucyeee");
        user.setAge(20);
        user.setEmail("1243@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    //查找全部
    @Test
    public void findAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }

}
