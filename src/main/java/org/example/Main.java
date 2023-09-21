package org.example;


class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        a전사.재공격();
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    String lastName;
    String lastWeapon;
    void 공격(String name, String weapon){
        System.out.println(name + "이(가) " + weapon + "(으)로 공격합니다");
        lastName = name;
        lastWeapon = weapon;
    }
    void 재공격(){
        System.out.println(lastName + "이(가) " + lastWeapon + "(으)로 재공격합니다");
    }
}
