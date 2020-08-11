package day11.classMember;

public class Test {
    public static void main(String[] args) {

        Weapon wp = new Weapon("奥sad",500);

        Armour ar = new Armour("一级头", 200);
        Role role = new Role();
        // 设置武器
        role.setWp(wp);
        // 设置防御
        role.setAr(ar);
        // 攻击
        role.attack();

        role.wear();





    }
}

