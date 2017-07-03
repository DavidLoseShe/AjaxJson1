package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by d on 2017/7/2.
 */
@Entity
public class Activity {
    private int activityId;
    private String activityName;
    private Timestamp activityFristDate;
    private Timestamp activityFinnalDate;
    private String activityPerson;
    private String activityAddress;

    @Id
    @Column(name = "activityId", nullable = false)
    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    @Basic
    @Column(name = "activityName", nullable = true, length = 50)
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Basic
    @Column(name = "activityFristDate", nullable = true)
    public Timestamp getActivityFristDate() {
        return activityFristDate;
    }

    public void setActivityFristDate(Timestamp activityFristDate) {
        this.activityFristDate = activityFristDate;
    }

    @Basic
    @Column(name = "activityFinnalDate", nullable = true)
    public Timestamp getActivityFinnalDate() {
        return activityFinnalDate;
    }

    public void setActivityFinnalDate(Timestamp activityFinnalDate) {
        this.activityFinnalDate = activityFinnalDate;
    }

    @Basic
    @Column(name = "activityPerson", nullable = true, length = 100)
    public String getActivityPerson() {
        return activityPerson;
    }

    public void setActivityPerson(String activityPerson) {
        this.activityPerson = activityPerson;
    }

    @Basic
    @Column(name = "activityAddress", nullable = true, length = 200)
    public String getActivityAddress() {
        return activityAddress;
    }

    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (activityId != activity.activityId) return false;
        if (activityName != null ? !activityName.equals(activity.activityName) : activity.activityName != null)
            return false;
        if (activityFristDate != null ? !activityFristDate.equals(activity.activityFristDate) : activity.activityFristDate != null)
            return false;
        if (activityFinnalDate != null ? !activityFinnalDate.equals(activity.activityFinnalDate) : activity.activityFinnalDate != null)
            return false;
        if (activityPerson != null ? !activityPerson.equals(activity.activityPerson) : activity.activityPerson != null)
            return false;
        if (activityAddress != null ? !activityAddress.equals(activity.activityAddress) : activity.activityAddress != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = activityId;
        result = 31 * result + (activityName != null ? activityName.hashCode() : 0);
        result = 31 * result + (activityFristDate != null ? activityFristDate.hashCode() : 0);
        result = 31 * result + (activityFinnalDate != null ? activityFinnalDate.hashCode() : 0);
        result = 31 * result + (activityPerson != null ? activityPerson.hashCode() : 0);
        result = 31 * result + (activityAddress != null ? activityAddress.hashCode() : 0);
        return result;
    }
}
