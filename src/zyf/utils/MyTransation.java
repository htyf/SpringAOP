package zyf.utils;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component(value="trans")
@Aspect//等同于<aop:aspect ref="myTransaction"></aop:aspect>
public class MyTransation {
	//等同于<aop:around method="transaction"  
	//pointcut="execution( * *..*.*ServiceImpl.*(..))"/>
	@Before(value="execution( * *..*.*ServiceImpl.*(..))")
	public void beginTransation(){
		System.out.println("开启事务。。。。。。。。。。");
	}
	@AfterReturning(value="execution( * *..*.*ServiceImpl.*(..))")
	public void commitTransation(){
		System.out.println("提交事务。。。。。。。。。。");
	}
	@AfterThrowing(value="execution( * *..*.*ServiceImpl.*(..))")
	public void rollbackTransation(){
		System.out.println("回滚事务。。。。。。。。。。");
	}

	@After(value="execution( * *..*.*ServiceImpl.*(..))")
	public void doFinally(){
		System.out.println("关闭资源...");

	}

}




