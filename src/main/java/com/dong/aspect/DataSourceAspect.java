package com.dong.aspect;

import com.dong.annotation.DataSource;
import com.dong.common.util.datasource.HandleDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by admin on 2017/2/23.
 *
 * @author XuDong, Zhu
 * @version 2.4.2
 * @ClassName: DataSourceAspect
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2017 -02-23 11:16:20
 */
public class DataSourceAspect {

    /**
     * 在dao层方法之前获取datasource对象之前在切面中指定当前线程数据源路由的key
     *
     * @param point the point
     * @author XuDong, Zhu
     * @date 2017 -02-23 11:16:20
     * @version 2.4.2
     */
    public void before(JoinPoint point)
    {
        Object target = point.getTarget();
        System.out.println(target.toString());
        String method = point.getSignature().getName();
        System.out.println(method);
        Class<?>[] classz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
                .getMethod().getParameterTypes();
        try {
            Method m = classz[0].getMethod(method, parameterTypes);
            System.out.println(m.getName());
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
                System.out.println("用户选择数据库库类型：" + data.value().getDataSourceCode());
                HandleDataSource.putDataSource(data.value().getDataSourceCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
