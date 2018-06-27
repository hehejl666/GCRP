package cn.edu.hzvtc.gcrp.base;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : tao
 * @date : 2018-06-27 11:29
 */
@Transactional(rollbackOn = Exception.class)
public class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDao<T> baseDao;

    public BaseServiceImpl(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public T select(Long id) {
        return baseDao.select(id);
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
}
