import java.util.Scanner;
public class Main {
    public static BST tree=new BST();
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite los nombres del arreglo separados por espacios");
        String names = sc.nextLine();

        String[] array = names.split(" ");
        System.out.println(names);
        balancedTree(array);

        System.out.println("orden inverso: ");
        tree.inOrder();

    }

    public static void balancedTree(String[] array){

        int center= (array.length-1)/2;

        tree.add(new Node(array[center]));

        for (int i  = 0; i< array.length;i++){
            tree.add(new Node(array[i]));
        }
    }



}