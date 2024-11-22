import java.util.Scanner;

public class MediaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementiMedia[] elements = new ElementiMedia[5];

        // Creazione di 5 elementi multimediali
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1: Immagine, 2: Audio, 3: Video): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumare newline

            System.out.print("Titolo: ");
            String title = scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Luminosità: ");
                    int brightness = scanner.nextInt();
                    elements[i] = new Immagine( title, brightness);
                }
                case 2 -> {
                    System.out.print("Durata: ");
                    int duration = scanner.nextInt();
                    System.out.print("Volume: ");
                    int volume = scanner.nextInt();
                    elements[i] = new AudioRecording(title, duration, volume);
                }
                case 3 -> {
                    System.out.print("Durata: ");
                    int duration = scanner.nextInt();
                    System.out.print("Volume: ");
                    int volume = scanner.nextInt();
                    System.out.print("Luminosità: ");
                    int brightness = scanner.nextInt();
                    elements[i] = new Video(title, duration, volume, brightness);
                }
                default -> System.out.println("Scelta non valida.");
            }
        }

        // Esecuzione degli elementi
        while (true) {
            System.out.println("\nScegli un elemento da eseguire (1-5) o 0 per terminare:");
            int index = scanner.nextInt();
            if (index == 0) break;
            if (index >= 1 && index <= 5) {
                elements[index - 1].execute();
            } else {
                System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
}
}
