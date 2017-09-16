import java.util.*;

public class MethodRefrence {
    public static void main(String args[]) {

        Laptop mac = new Laptop(1, 2015, "mac book");
        Laptop surface = new Laptop(2, 2010, "surface");
        Laptop hp = new Laptop(3, 2011, "hp");
        Laptop lenovo = new Laptop(4, 2085, "lenovo yoga");

        List<Laptop> laptops = new ArrayList<>();
        buildLaptopsList(mac, surface, hp, lenovo, laptops);

        System.out.println("\n \n ------------ Unsorted List ------------");
        printLaptops(laptops);
        sortWithModel(laptops);
        sortWithYear(laptops);
        System.out.println("\n \n ---------------------------------------");
    }

    private static void sortWithYear(List<Laptop> laptops) {
        System.out.println("\n \n  ------------ After sorting laptops with Year------------");
        sortLaptopsWithYear(laptops);
        printLaptops(laptops);
    }

    private static void sortWithModel(List<Laptop> laptops) {
        System.out.println("\n \n  ------------ After sorting laptops with Model ------------");
        sortLaptopsWithModel(laptops);
        printLaptops(laptops);
    }

    private static void sortLaptopsWithYear(List<Laptop> laptops, Object getYear) {
    }

    private static void sortLaptopsWithModel(List<Laptop> laptops) {
        Comparator modelComparator = Comparator.comparing(Laptop::getModel);
        Collections.sort(laptops, modelComparator);
    }

    private static void sortLaptopsWithYear(List<Laptop> laptops) {
        Comparator modelComparator = Comparator.comparing(Laptop::getYear);
        Collections.sort(laptops, modelComparator);
    }

    private static void buildLaptopsList(Laptop mac, Laptop surface, Laptop hp, Laptop lenovo, List<Laptop> laptops) {
        laptops.add(mac);
        laptops.add(surface);
        laptops.add(hp);
        laptops.add(lenovo);
    }

    private static void printLaptops(List<Laptop> laptops) {
        laptops.forEach(laptop -> {
            System.out.println();
            System.out.print(laptop.getId() + " | \t");
            System.out.print(laptop.getYear() + " | \t");
            System.out.print(laptop.getModel() + " | \t");
        });
    }
}

class Laptop {

    Integer id;
    Integer year;
    String model;

    public Laptop(int id, Integer year, String model) {
        this.id = id;
        this.year = year;
        this.model = model;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
