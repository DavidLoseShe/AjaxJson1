package entity;

import javax.persistence.*;

/**
 * Created by d on 2017/6/30.
 */
@Entity
@Table(name = "admininformation", schema = "ajaxlogin", catalog = "")
public class Admin {
    private String adminId;
    private String adminPassword;
    private Integer adminAge;

    @Id
    @Column(name = "adminID")
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "adminPassword")
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Basic
    @Column(name = "adminAge")
    public Integer getAdminAge() {
        return adminAge;
    }

    public void setAdminAge(Integer adminAge) {
        this.adminAge = adminAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (adminId != null ? !adminId.equals(admin.adminId) : admin.adminId != null) return false;
        if (adminPassword != null ? !adminPassword.equals(admin.adminPassword) : admin.adminPassword != null)
            return false;
        if (adminAge != null ? !adminAge.equals(admin.adminAge) : admin.adminAge != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId != null ? adminId.hashCode() : 0;
        result = 31 * result + (adminPassword != null ? adminPassword.hashCode() : 0);
        result = 31 * result + (adminAge != null ? adminAge.hashCode() : 0);
        return result;
    }
}
