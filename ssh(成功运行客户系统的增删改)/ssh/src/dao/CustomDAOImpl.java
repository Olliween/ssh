package dao;

import entity.Custom;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

/**
 * @Name: CustomDAOImpl
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 12:39
 */
public class CustomDAOImpl implements CustomDAO {
    private SessionFactory sessionFactory;
    private HibernateTemplate hibernateTemplate;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public HibernateTemplate getHibernateTemplate() {
        if (hibernateTemplate == null) {
            hibernateTemplate = new HibernateTemplate(sessionFactory);
        }
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(Custom custom) {
        hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        getHibernateTemplate().save(custom);
        getHibernateTemplate().flush();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Custom> getCustom(String name) {
        String hsql = "from Custom where name='" + name + "'";
        List<Custom> result = (List<Custom>) getHibernateTemplate().find(hsql);
        return result;
    }

    @Override
    public void delete(int id) {
        hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        getHibernateTemplate().delete(findById(id));
        getHibernateTemplate().flush();
    }

    @Override
    public void update(Custom custom) {
        hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        getHibernateTemplate().merge(custom);
        getHibernateTemplate().flush();
    }

    @Override
    public Custom findById(int id) {
        Custom custom = (Custom) getHibernateTemplate().get(Custom.class, new Integer(id));
        return custom;
    }

    @Override
    @SuppressWarnings("unckecked")
    public List<Custom> findAll() {
        String queryString = "from Custom";
        List<Custom> list = (List<Custom>) getHibernateTemplate().find(queryString);
        return list;
    }
}
