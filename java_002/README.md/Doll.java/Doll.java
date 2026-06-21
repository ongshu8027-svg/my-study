public class Doll {
    String name;
    String type;
    int happiness;

    public Doll(String name, String type) {
        this.name = name;
        this.type = type;
        this.happiness = 50;
    }

    public void hug() {
        this.happiness += 10;
        System.out.println(name + "(" + type + ")을(를) 꼭 안아주었습니다. (행복도 +10)");
    }

    public void introduce() {
        System.out.println("안녕? 나는 " + type + "인형인 '" + name + "'야! 내 행복도는 " + this.happiness + "이야.");
    }
}