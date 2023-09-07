class Juice {
    String name;

    public void buyDrink(String taste, int price) {
        System.out.println("の" + taste + "味です。" + price + "円になります。");
    }
}

class Coffee {
    String name;

    public void buyDrink(String sweet, String milk, int price) {
        System.out.println("の甘さは" + sweet + "、ミルク" + milk + "です。" + price + "円になります。");
    }
}

public class ComprehensiveBeginner02_03 {
    public static void main(String[] args) {
        Juice a001 = new Juice();
        a001.name = "バヤリース";
        System.out.print(a001.name);
        a001.buyDrink("オレンジ", 130);

        Juice a002 = new Juice();
        a002.name = "午後の紅茶";
        System.out.print(a002.name);
        a002.buyDrink("レモンティー", 150);

        Coffee a003 = new Coffee();
        a003.name = "ボス";
        System.out.print(a003.name);
        a003.buyDrink("控え目", "無し", 110);

        Coffee a004 = new Coffee();
        a004.name = "ジョージア";
        System.out.print(a004.name);
        a004.buyDrink("甘め", "入り", 120);
    }
}