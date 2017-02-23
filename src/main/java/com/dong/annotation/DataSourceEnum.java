package com.dong.annotation;

/**
 * 数据库字典.
 *
 * @author XuDong, Zhu
 * @version 2.4.2
 * @ClassName: DataSourceEnum
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2017 -02-23 14:59:08
 */
public enum DataSourceEnum {
    /**
     * The constant DATA_SOURCE_READ.
     */
    DATA_SOURCE_READ("read", "只读数据库"),
    /**
     * The constant DATA_SOURCE_WRITE.
     */
    DATA_SOURCE_WRITE("write", "可写数据库");


    /**
     * The constant dataSourceCode.
     */
    private String dataSourceCode;

    /**
     * The constant dataSourceName.
     */
    private String dataSourceName;

    /**
     * Instantiates a new Data source enum.
     *
     * @param dataSourceCode the data source code
     * @param dataSourceName the data source name
     */
    DataSourceEnum(String dataSourceCode, String dataSourceName) {
        this.dataSourceCode = dataSourceCode;
        this.dataSourceName = dataSourceName;
    }

    /**
     * Get data source code.
     *
     * @return string
     * @author XuDong, Zhu
     * @date 2017 -02-23 14:59:08
     * @version 2.4.2
     */
    public String getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * Set data source code.
     *
     * @param dataSourceCode the data source code
     * @author XuDong, Zhu
     * @date 2017 -02-23 14:59:08
     * @version 2.4.2
     */
    public void setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
    }

    /**
     * Get data source name.
     *
     * @return string
     * @author XuDong, Zhu
     * @date 2017 -02-23 14:59:09
     * @version 2.4.2
     */
    public String getDataSourceName() {
        return dataSourceName;
    }

    /**
     * Set data source name.
     *
     * @param dataSourceName the data source name
     * @author XuDong, Zhu
     * @date 2017 -02-23 14:59:09
     * @version 2.4.2
     */
    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }
}
