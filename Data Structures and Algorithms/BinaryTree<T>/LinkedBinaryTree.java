import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Stack;

public class LinkedBinaryTree<T> extends AbstractBinaryTree<T>
{
    //Factory method to create a node
    protected TreeNode<T> createNode (T element, TreeNode<T> parentNode, TreeNode leftNode, TreeNode<T> rightNode)
    {
        return new TreeNode<T>(element, parentNode, leftNode, rightNode);
    }

    protected TreeNode<T> root = null;
    private int size = 0;

    //Constructor
    public LinkedBinaryTree(){}


    @Override
    public TreeNode<T> root() {
        return this.root;
    }

    @Override
    public TreeNode<T> parent(TreeNode<T> node) {
        return super.parent(node);
    }

    @Override
    public TreeNode<T> left(TreeNode<T> node) {
        return node.getLeft();
    }

    @Override
    public TreeNode<T> right(TreeNode<T> node) {
        return node.getRight();
    }

    @Override
    public TreeNode<T> sibling(TreeNode<T> node) {
        return null;
    }



    //Implement Methods from interface
    public Iterator<T> iterator(LinkedBinaryTree<T> tree) {
        return null;
    }

    //Interator mit Stack ??                //pls check!! doesn't work
    Stack<TreeNode<T>> stack;
    @Override
    public Iterator<T> iterator() {
        stack = new Stack<TreeNode<T>>();
        while (root!= null){
            stack.push(root);
            root = root.getLeft();
        }
        return null;
    }
    //hilfs methoden Iterator
    public T next(){
        TreeNode<T> node = stack.pop();
        T result = node.getElement();
        if (node.getRight() != null)
        {
            node = node.getRight();
            while (node != null)
            {
                stack.push(node);
                node = node.getLeft();
            }
        }
        return result;
    } //    end next()

    @Override
    public Iterable<TreeNode<T>> getNode() {
        return null;
    }

    @Override
    public Iterable<TreeNode<T>> getNodes() {
        return null;
    }

    @Override
    public Iterable<TreeNode<T>> getChildren(TreeNode<T> node) {
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty(TreeNode<T> node) {
        return false;
    }



    //end of implement Methods from Interface

    //Implement Methods from Slides
    public TreeNode<T> addRoot(T element) throws IllegalStateException
    {
        if (!isEmpty()) throw new IllegalStateException("Cannot add a new root to existing Tree!");
        root = createNode(element, null, null, null);
        size = 1;
        return root;
    }

    public TreeNode<T> addLeft(TreeNode<T> parent, T child) throws IllegalStateException
    {
        if (parent.getLeft() != null) throw new IllegalStateException("Cannot add a new left child to an existing one!");
        TreeNode<T> childNode = createNode(child, parent, null, null);
        parent.setLeft(childNode);
        size++;
        return childNode;
    }

    public TreeNode<T> addRight(TreeNode<T> parent, T child)throws IllegalStateException
    {
        if (parent.getRight()!=null) throw new IllegalStateException("Cannot add a new right child to an existing one");
        TreeNode<T> childNote = createNode(child, parent, null, null);
        parent.setRight(childNote);
        size++;
        return childNote;
    }

    //replace Element and return replaced
    public T set(TreeNode<T> node, T newElement)
    {
        T oldElement = node.getElement();   //save oldElement
        node.setElement(newElement);        //set Element
        return oldElement;                  //return old
    } //    end set

    //
    public void attach(TreeNode<T> leaf, LinkedBinaryTree<T> leftSubTree, LinkedBinaryTree<T> rightSubTree)
    {
        /*int addSize = 0;*/
        if (isInternal(leaf)) throw new IllegalArgumentException("Cannot add a SubTree to an Internal Node");
        /*
        if (leftSubTree!=null && rightSubTree!= null){ //if both sides are added
            if (leftSubTree.size()<rightSubTree.size()){
                addSize = righ
            } else {addSize = }
        } else {addSize += rightSubTree.size()+leftSubTree.size();}
        */
        //add size to tree
        size += leftSubTree.size() + rightSubTree.size();
        //add left
        if (!leftSubTree.isEmpty())
        {
            leftSubTree.root.setParent(leaf);
            leaf.setLeft(leftSubTree.root);
            leftSubTree.root= null;
            leftSubTree.size= 0;
        }
        //add Left
        if (!rightSubTree.isEmpty())
        {
            rightSubTree.root.setParent(leaf);
            leaf.setLeft(rightSubTree.root);
            rightSubTree.root= null;
            rightSubTree.size= 0;
        }

    } //    end attach

    public T remove(TreeNode<T> node) throws IllegalArgumentException
    {
        // Case: 2 children:
        if (numChildren(node) == 2) throw new IllegalArgumentException("Node has two children Nodes");
        // Case 1 child:
        TreeNode<T> childNode = node.getLeft() != null ? node.getLeft(): node.getRight();   //select the one child
            // move child up to parent
        if (childNode!= null)
            childNode.setParent(node.getParent());  // Child set new parent
        //Case node is root:
        if (node == root){root = childNode;}

        //set the one child
        else
        {
            TreeNode<T> parent = node.getParent();
            if (node == parent.getLeft()){
                parent.setLeft(childNode);}
            else{
                parent.setRight(childNode);}
        }
        size--;
        T removedElement = node.getElement();   // save removed Element
        //delete old node
        node.setElement(null);
        node.setLeft(null);
        node.setRight(null);
        node.setParent(null);

        //return
        return removedElement;
    }


}
