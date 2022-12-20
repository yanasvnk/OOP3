public class Main {
    public static void main(String[] args) {
        Train train = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500, 0,
                "Белорусский вокзал", "Минск-Пассажирский", 11);

        Train train1 = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 0,
                "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        Bus bus = new Bus ("Жигули", "NM-45", 2017, "Россия", "зелёный", 145);


        System.out.println(train);
        System.out.println(train1);
        System.out.println(bus);
        bus.refill();
    }
}