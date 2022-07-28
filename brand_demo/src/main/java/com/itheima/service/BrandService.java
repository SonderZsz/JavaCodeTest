package com.itheima.service;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandService {

    // 使用Mybatis调用BrandMapper.selectAll()
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Brand> selectAll() {

        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BrandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        List<Brand> brands = mapper.selectAll();

        sqlSession.close();

        return brands;

    }

}
