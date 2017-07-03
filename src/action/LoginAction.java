package action;

import dao.LoginDao;
import entity.Activity;
import entity.Admin;

import java.util.List;

/**
 * Created by d on 2017/6/30.
 */
public class LoginAction {
    private Admin admin;
    private boolean checkResult;
    private List<Activity> activityList;

    public boolean isCheckResult() {
        return checkResult;
    }

    public void setCheckResult(boolean checkResult) {
        this.checkResult = checkResult;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
   public String Check(){
       LoginDao loginDao = new LoginDao();
       checkResult=loginDao.LoginCheck(admin.getAdminId());
       return  "1";
   }
   public String Info(){
       LoginDao loginDao = new LoginDao();
       admin = loginDao.LoginInfo(admin);
       return "1";
   }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public String ActivityTable(){
       LoginDao loginDao = new LoginDao();
       activityList=loginDao.activityTable();
       System.out.println(activityList.get(0).getActivityAddress());
       return "1";
   }
}
