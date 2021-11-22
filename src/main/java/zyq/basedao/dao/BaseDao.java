package zyq.basedao.dao;

import java.util.List;
import java.util.List;

/**
 * @authoradmin
 * @date 2021/11/20 10:52
 * @description BaseDao
 */

public interface BaseDao<T> {

    /**
     * 新增
     *
     * @param t
     */
    void add(T t);

    /**
     * 删除
     *
     * @param t
     */
    void delete(T t);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    T get(Long id);

    /**
     * 根据指定的属性查找
     *
     * @param fieldName
     * @param value
     * @return
     */
    List<T> findByField(String fieldName, Object value);

    /**
     * 删除
     *
     * @param t
     * @param id
     */
    void update(T t, Long id);

    /**
     * 查询所有
     *
     * @return
     */
    List<T> findAll();
}
