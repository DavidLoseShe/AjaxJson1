package dao;

import entity.Activity;
import entity.Admin;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by d on 2017/6/30.
 */
public class LoginDao {
    public boolean LoginCheck(String adminId){
        String hql="From Admin where adminId =?1";
        Session session = Main.getSession();
        Query query = session.createQuery(hql);
        query.setParameter(1, adminId);
        List<Admin> list =query.list();

        for(Admin admin1 :list){
            return  true;
        }
        return false;
    }
    public Admin LoginInfo(Admin admin){
        String hql="From Admin where adminId=?1 and adminPassword=?2";
        Session session = Main.getSession();
        Query query = session.createQuery(hql);
        query.setParameter(1, admin.getAdminId());
        query.setParameter(2,admin.getAdminPassword());
        List<Admin> list =query.list();
        for(Admin admin1 :list){
            return admin1;
        }
        return  null;
    }
    public List<Activity> activityTable(){
        System.out.println("77777777777777777777777777");
        String hql ="From Activity";
        Session session = Main.getSession();
        Query query = session.createQuery(hql);
        List<Activity> activities =query.list();
        return  activities;
    }
}
