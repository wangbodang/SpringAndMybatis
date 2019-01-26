package com.wangbodang.common.mybatis;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

@Intercepts({    @Signature(type = Executor.class, method = "update", args = {
                            MappedStatement.class, Object.class }),
                 @Signature(
                            type= Executor.class,
                            method="query",
                            args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
                            )})

public class ExamplePlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("|   -*-> 插件执行1");
        Object[] args = invocation.getArgs();
        //System.out.println("--> 参数个数:"+args.length);
        //System.out.println("---> 参数类型:"+args[0].getClass());
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        //System.out.println("   -*-> 插件执行2");
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        //System.out.println("   -*-> 插件执行3");
        //System.out.println("-->属性 : "+properties);
    }
}
