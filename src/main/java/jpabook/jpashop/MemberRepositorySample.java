package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepositorySample {

    @PersistenceContext
    private EntityManager em;

    public Long save(MemberSample member) {
        em.persist(member);
        return member.getId();
    }

    public MemberSample find(Long id) {
        return em.find(MemberSample.class, id);
    }
}
