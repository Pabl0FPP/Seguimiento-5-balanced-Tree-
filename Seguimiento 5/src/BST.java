public class BST {

    Node root;


    public void add(Node node){
        if(root == null){
            root = node;
            System.out.println(root.getName());
        }else{
            add(root, node);
        }
    }

    private void add(Node current, Node node){
        if(node.getName().compareTo(current.getName()) < 0){
            //Meter a la izquierda
            if(current.getLeft() == null){
                current.setLeft(node);
            }else{
                add(current.getLeft(), node);
            }
        }else if(node.getName().compareTo(current.getName()) > 0){
            //Meter a la derecha
            if(current.getRight() == null){
                current.setRight(node);
            }else{
                add(current.getRight(), node);
            }

        }else{
            //No hacer nada
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node current){
        if(current == null) return;
        inOrder(current.getRight());
        System.out.print(current.getName() + " ");
        inOrder(current.getLeft());

    }

    private Node subTree(String[] array) {

        if(array==null){
            return null;
        }

        int mid=(array.length-1)/2;

        Node node= new Node(array[mid]);

        node.left = subTree(separateArr(0, mid, array));
        node.right = subTree(separateArr(mid+1, array.length, array));

        return node;
    }

    public String[] separateArr( int izq, int der,String[] array) {
        if (der - izq <= 0) {
            return null;
        }
        String[] arr = new String[der-izq];
        int pos = 0;
        for (int i = izq; i < der; i++) {
            if (array.length > i) {
                arr[pos] = array[i];
            }
            pos++;
        }
        return arr;
    }


    private Node tree(String[] array, int a) {

        int mid = (array.length-1)/2;

        Node node = new Node(array[mid]);

        node.left = subTree(separateArr(0, mid, array));
        node.right = subTree(separateArr(mid+1, array.length, array));

        return node;
    }

    public void tree(String[] array){

        root= tree(array, 0);
    }


}