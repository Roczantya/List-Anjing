import java.util.ArrayList;

public class Petshop {
    public static void main(String[] args) {
        ArrayList<Dog> Listanjing = new ArrayList<Dog>();
        Listanjing.add(new AiredaleTerrier("Rina", 3, "Sedang", "Coklat-putih", "Lurus", "Male", true));
        Listanjing.add(new BichonFrise("Snowy", 3, "Kecil", "Putih", "Keriting", "Female", true));
        Listanjing.add(new Doberman("Bruno", 5, "Besar", "Hitam", "Kasar", "Male", false));
        Listanjing.add(new Bulldog("Tuna", 4, "Besar", "putih", "lurus", "Female", true));
        Listanjing.add(new Pomeranian("Fluffy", 2, "Kecil", "Coklat", "Keriting", "Female", true));
        Listanjing.add(new AlaskanMalamute("Buddy", 4, "Besar", "Abu-abu", "Panjang", "Male", true));
        Listanjing.add(new ContinentalToySpaniel("Luna", 3, "Sedang", "Hitam", "Lurus", "Female", true));
        Listanjing.add(new BluePicardySpaniel("Lina", 3, "Sedang", "Hitam", "Lurus", "Female", true));
        Listanjing.add(new AustralianKelpie("Lisa", 4, "Besar", "Hitam-putih", "Keriting", "Male", true));
        Listanjing.add(new PetitBrabançon("Bobby", 2, "Kecil", "Coklat", "Keriting", "Male", true));

        System.out.println("List of Dogs in the Petshop:");
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | \n", "Name", "Age", "Size", "Color", "Fur Type", "Gender", "Eats Daily", "Sudah Makan Hari ini");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Dog dog : Listanjing) {
            String sudahMakan = dog.getMakanSehari() ? "Masuk dalam kandang dan tidur" : "Mengonggong Keras";
            switch (dog.getUkuran()) {
                case "Kecil":
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-25s | \n", dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "Ya" : "Tidak", sudahMakan);
                    break;
                case "Sedang":
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | \n", dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "Ya" : "Tidak", sudahMakan);
                    break;
                case "Besar":
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | \n", dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "Ya" : "Tidak", sudahMakan);
                    break;
                default:
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | \n", dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "Ya" : "Tidak", sudahMakan);
                    break;
            }
            printDivider();
        }
    }

    // Method untuk mencetak garis pembatas
    private static void printDivider() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}

    

