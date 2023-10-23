/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annp.repository.impl;

import com.annp.pojo.CategorySub;
import com.annp.repository.CategorySubRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author phuan
 */
@Repository
@Transactional
public class CategorySubRepositoryImpl implements CategorySubRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<CategorySub> getCategorySub() {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("From CategorySub");
        return q.getResultList();
    }

    @Override
    public List<CategorySub> getCategorySub(Map<String, String> params, int start, int limit) {
        try {
            Session s = factory.getObject().getCurrentSession();
            CriteriaBuilder b = s.getCriteriaBuilder();
            CriteriaQuery<CategorySub> q = b.createQuery(CategorySub.class);
            Root root = q.from(CategorySub.class);
            q.select(root);

            if (params != null) {
                List<Predicate> predicates = new ArrayList<>();
                String kw = params.get("kw");
                if (kw != null && !kw.isEmpty()) {
                    Predicate p = b.like(root.get("name").as(String.class),
                            String.format("%%%s%%", kw));
                    predicates.add(p);
                }
                q.where(predicates.toArray(Predicate[]::new));
            }

            q.orderBy(b.asc(root.get("categoryId")));
            Query query = s.createQuery(q);
            if (start > 0 && limit > 0) {
                query.setFirstResult(start - 1); // Vị trí bắt đầu
                query.setMaxResults(limit); // Số lượng kết quả trả về
            }
            return query.getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public boolean deleteCategorySub(int id) {
        CategorySub sub = this.getCategorySubById(id);
        Session s = this.factory.getObject().getCurrentSession();
        try {
            s.delete(sub);
            return true;
        } catch (HibernateException ex) {
            return false;
        }
    }

    @Override
    public CategorySub getCategorySubById(int id) {
        Session s = this.factory.getObject().getCurrentSession();
        return s.get(CategorySub.class, id);
    }

    @Override
    public boolean updateCategorySub(CategorySub categorySub) {
        Session session = this.factory.getObject().getCurrentSession();
        try {
            session.update(categorySub);
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
