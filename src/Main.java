public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("еще можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeinght = 2;
        var zucchiniWeinght = 2;
        var vegetablesWeinght = tomatoesWeight + cucumbersWeight + peppersWeinght +zucchiniWeinght;
        var productsWeinght = fruitWeight + vegetablesWeinght + meatWeight + waterWeight;
        System.out.println("Общий вс продуктов "+ productsWeinght + " кг!");

        var leftWeinght = liftingCapacity - stuffWeight - productsWeinght;
        System.out.println("Места осталось " + leftWeinght + " кг!");

        productsWeinght = productsWeinght * 2;
        System.out.println("Теперь вес продуктов " + productsWeinght);

        leftWeinght = liftingCapacity - stuffWeight - productsWeinght;
        System.out.println("Теперь места осталось " + leftWeinght + " кг!");

        var overload = (stuffWeight + productsWeinght) % liftingCapacity;
        System.out.println("Перегруз на " + overload +" кг!");

        var productsInOneCar = productsWeinght / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);

        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг");

        byte a = 1;
        short b = 1;
        int c =1;
        int d = a + b + c;
        System.out.println(d);



    }
}