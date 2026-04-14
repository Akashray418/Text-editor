import java.util.Scanner;
class Document {
    private StringBuffer textBuffer;

    // Constructor
    public Document() {
        textBuffer = new StringBuffer();
    }

    // Add text
    public void addText(String text) {
        textBuffer.append(text);
        System.out.println("Text added successfully!");
    }

    // Display text
    public void displayText() {
        System.out.println("Text: " + textBuffer.toString());
    }

    // Reverse text
    public void reverseText() {
        textBuffer.reverse();
        System.out.println("Text reversed successfully!");
    }

    // Replace text
    public void replaceText(String oldText, String newText) {
        int index = textBuffer.indexOf(oldText);
        if (index != -1) {
            textBuffer.replace(index, index + oldText.length(), newText);
            System.out.println("Text replaced successfully!");
        } else {
            System.out.println("Text not found!");
        }
    }

    // Clear text
    public void clearText() {
        textBuffer.setLength(0);
        System.out.println("Text cleared successfully!");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document doc = new Document();

        int choice;

        do {
            System.out.println("\n===== SIMPLE TEXT EDITOR =====");
            System.out.println("1. Add Text");
            System.out.println("2. Display Text");
            System.out.println("3. Reverse Text");
            System.out.println("4. Replace Text");
            System.out.println("5. Clear Text");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    doc.addText(text);
                    break;

                case 2:
                    doc.displayText();
                    break;

                case 3:
                    doc.reverseText();
                    doc.displayText();
                    break;

                case 4:
                    System.out.print("Enter old text: ");
                    String oldText = sc.nextLine();
                    System.out.print("Enter new text: ");
                    String newText = sc.nextLine();
                    doc.replaceText(oldText, newText);
                    doc.displayText();
                    break;

                case 5:
                    doc.clearText();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
