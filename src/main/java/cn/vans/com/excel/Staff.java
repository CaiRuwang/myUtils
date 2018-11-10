package cn.vans.com.excel;

public class Staff {
    private String userName;
    private String age;
    private String sex;
    private String workAddrs;
    private String workUnit;
    private String brothPlace;

    public Staff(String userName, String age, String sex) {
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    public Staff(String userName, String age, String sex, String workAddrs, String workUnit, String brothPlace) {
        this.userName = userName;
        this.age = age;
        this.sex = sex;
        this.workAddrs = workAddrs;
        this.workUnit = workUnit;
        this.brothPlace = brothPlace;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWorkAddrs() {
        return workAddrs;
    }

    public void setWorkAddrs(String workAddrs) {
        this.workAddrs = workAddrs;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getBrothPlace() {
        return brothPlace;
    }

    public void setBrothPlace(String brothPlace) {
        this.brothPlace = brothPlace;
    }
}
