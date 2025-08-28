import java.util.Scanner;

class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = sc.nextLine();

        int charCount = text.length();
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;
        // Split text into sentences using punctuation marks (. ! ?)
        int sentenceCount = text.split("[.!?]").length;

        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);

        sc.close();
    }
}
