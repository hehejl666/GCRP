package cn.edu.hzvtc.gcrp.base;

import org.hibernate.Session;

import java.util.List;

/**
 * @author : tao
 * @date   : 2018-06-27 09:54
 */
public interface BaseDao<T> {
    /***
     * 单条记录查询
     * @param id
     * @return
     */
    T select(Long id);

    /***
     * 所有记录查询
     * @return
     */
    List<T> selectAll();

    /***
     * 包含关键字所有记录查询
     * @return
     */
    List<T> selectAll(String keyword);

    /***
     * 分页记录查询
     * @param start
     * @param size
     * @return
     */
    List<T> selectAll(Integer start,Integer size);

    /***
     * 分页包含关键字查询
     * @param start
     * @param size
     * @param keyword
     * @return
     */
    List<T> selectAll(Integer start,Integer size,String keyword);

    /***
     * 保存
     * @param entity
     * @return
     */
    boolean save(T entity);

    /***
     * 保存或更新
     * @param entity
     * @return
     */
    boolean saveOrUpdate(T entity);

    /***
     * 删除
     * @param id
     * @return
     */
    boolean delete(Long id);

    /***
     * 批量删除
     * @param ids
     * @return
     */
    boolean deleteAll(List<Long> ids);

    /***
     * 获取 Session
     * @return
     */
    Session getSession();
}
