package com.dong.common.util.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 实现spring 提供 AbstractRoutingDataSource 类 实现数据源设置.
 *
 * @author XuDong, Zhu
 * @version 2.4.2
 * @ClassName: ChooseDataSource
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2017 -02-23 11:13:53
 */
public class ChooseDataSource extends AbstractRoutingDataSource {

    /**
     * 获取与数据源相关的key
     * 此key是Map<String,DataSource> resolvedDataSources 中与数据源绑定的key值
     * 在通过determineTargetDataSource获取目标数据源时使用
     *
     * @return object
     * @author XuDong, Zhu
     * @date 2017 -02-23 11:13:53
     * @version 2.4.2
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return HandleDataSource.getDataSource();
    }
}
