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

}
