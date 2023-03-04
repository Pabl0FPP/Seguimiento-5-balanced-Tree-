import java.util.Scanner;
public class Main {
    public static BST tree=new BST();
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite los nombres del arreglo separados por espacios");
        String names = sc.nextLine();

        String[] array = names.split(" ");
        System.out.println(names);
        tree.tree(array);

        System.out.println("orden inverso: ");
        tree.inOrder();

    }
}