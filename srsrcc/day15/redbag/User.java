package day15.redbag;

public class User {
 private String Username;
 private int leftMoney;

    public User(String username, int leftMoney) {
        Username = username;
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }
    public void show(){
        System.out.println("用户"+Username+"\t"+"余额"+leftMoney);
    }
}