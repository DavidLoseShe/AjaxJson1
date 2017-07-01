package action;

import dao.LoginDao;
import entity.Admin;

/**
 * Created by d on 2017/6/30.
 */
public class LoginAction {
    private Admin admin;
    private boolean checkResult;

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
}
