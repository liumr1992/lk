package com.lk.entity;

public class Member {
    private String name;//姓名
    private String sex;//性别
    private String userName;//用户名
    private int age;//年龄
    private String passWord;//密码
    private String email;//邮箱
    private String phone;//手机号
    private String birthPlace;//籍贯
    private String  idCard;//身份证

    public Member() {
    }

    public Member(String name, String sex, String userName, int age, String passWord, String email, String phone, String birthPlace, String idCard) {
        this.name = name;
        this.sex = sex;
        this.userName = userName;
        this.age = age;
        this.passWord = passWord;
        this.email = email;
        this.phone = phone;
        this.birthPlace = birthPlace;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Member{" + "name='" + name + '\'' + ", sex='" + sex + '\'' + ", userName='" + userName + '\'' + ", age=" + age + ", passWord='" + passWord + '\'' + ", email='" + email + '\'' + ", phone='" + phone + '\'' + ", birthPlace='" + birthPlace + '\'' + ", idCard='" + idCard + '\'' + '}';
    }
}
