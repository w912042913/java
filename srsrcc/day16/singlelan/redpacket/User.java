package day16.singlelan.redpacket;

public class User {
   private int leftMoney;
   private String username;
   public User(){

   }
   public User(int leftMoney,String username){
       this.leftMoney=leftMoney;
       this.username = username;
   }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void show (){
        System.out.println("用户名："+username+"\t"+"余额"+leftMoney);
    }
}
