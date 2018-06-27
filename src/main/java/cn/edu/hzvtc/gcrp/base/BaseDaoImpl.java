package cn.edu.hzvtc.gcrp.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author  : tao
 * @date    : 2018-06-27 10:04
 */
@Transactional(rollbackOn = Exception.class)
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

    private Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
        entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Resource
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public T select(Long id) {
        return getSession().get(entityClass,id);
    }

    @Override
    public List<T> selectAll() {
        return null;
    }

    @Override
    public List<T> selectAll(String keyword) {
        return null;
    }

    @Override
    public List<T> selectAll(Integer start, Integer size) {
        return null;
    }

    @Override
    public List<T> selectAll(Integer start, Integer size, String keyword) {
        return null;
    }

    @Override
    public boolean save(T entity) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(T entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Long> ids) {
        return false;
    }

    @Override
    public Session getSession() {
        return super.currentSession();
    }

}
