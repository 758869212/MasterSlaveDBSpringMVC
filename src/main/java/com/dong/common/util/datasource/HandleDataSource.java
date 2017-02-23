package com.dong.common.util.datasource;

/**
 * 保存当前线程数据源的key:利用ThreadLocal 解决数据源设置 线程安全性问题.
 *
 * @author XuDong, Zhu
 * @version 2.4.2
 * @ClassName: HandleDataSource
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2017 -02-23 11:13:24
 */
public class HandleDataSource {

    /**
     * The constant holder.
     */
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    /**
     * 绑定当前线程数据源路由的key
     *
     * @param datasource the datasource
     * @author XuDong, Zhu
     * @date 2017 -02-23 11:13:24
     * @version 2.4.2
     */
    public static void putDataSource(String datasource) {
        holder.set(datasource);
    }

    /**
     * 获取当前线程的数据源路由的key
     *
     * @return
     * @author XuDong, Zhu
     * @date 2017 -02-23 11:13:24
     * @version 2.4.2
     */
    public static String getDataSource() {
        return holder.get();
    }
}
