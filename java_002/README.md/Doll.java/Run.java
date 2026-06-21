public class run { 
    public static void main(String[] args) {
        Doll teddyBear = new Doll("테디", "곰");
        Doll bunny = new Doll("버니", "토끼");

        System.out.println("=== 곰인형 테디 ===");
        teddyBear.introduce();
        teddyBear.hug();
        teddyBear.introduce();

        System.out.println("\n=== 토끼인형 버니 ===");
        bunny.introduce();
    }
}
