package zyq.basedao.enums;

/**
 * @authoradmin
 * @date 2021/11/30 16:32
 * @description DataSourceEnum
 */
public enum DataSourceEnum {
    /**
     * 数据源枚举
     */
    DATASOURCE;
    private final DbConnection connection;

    DataSourceEnum() {
        connection = new DbConnection();
    }

    public DbConnection getConnection() {
        return connection;
    }

    static class DbConnection {
        private DbConnection() {

        }
    }
}
