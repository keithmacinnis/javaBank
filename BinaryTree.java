import java.util.ArrayList;

public class BinaryTree<T> 
{
	private T data;
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;
	
	public BinaryTree()

	{
		parent = left = right = null;
		data = null;
	}
	public int nodeCount(){ //recursive node counter
		if (data==null) {
			return 0;
		} else {
			if (left != null && right !=null)
				return (1 + left.nodeCount() + right.nodeCount());
			if (left!=null)
				return (1 + left.nodeCount());
			if (right!=null)
				return (1 + right.nodeCount());
			return 1;
		}
	}
	public int height(){
		int leftCount=0,rightCount=0;
		if (data==null) {
			return -1;
		} else {
			if (left!=null)
				 leftCount= (1 + left.height());
			if (right!=null)
				 rightCount =  (1 + right.height());
			if (rightCount>leftCount)
				return rightCount;
			return leftCount;
		}
	}
	public static<T> void levelOrder(BinaryTree<T> tree) {
		ArrayList<BinaryTree> levelOrderer= new ArrayList<BinaryTree>();


	}
	public boolean balanced(){
		int leftsHeight = -1;
		if (left!=null)
			leftsHeight=left.height();
		int rightsHeight = -1;
		if (right!=null)
			rightsHeight=right.height();
		System.out.println(rightsHeight + " " +leftsHeight);
		if ((leftsHeight-rightsHeight)>1 || ((rightsHeight-leftsHeight)>1 ))
			return false;
		return true; 
	}
	public void makeRoot(T data)
	{
		if (!isEmpty())
		{
			System.out.println("Can't make root. Already exists");
		}
		else
			this.data = data;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public void setLeft(BinaryTree<T> tree)
	{
		left = tree;
	}
	public void setRight(BinaryTree<T> tree)
	{
		right = tree;
	}
	public void setParent(BinaryTree<T> tree)
	{
		parent = tree;
	}
	
	public T getData()
	{
		return data;
	}
	public BinaryTree<T> getParent()
	{
		return parent;
	}
	public BinaryTree<T> getLeft()
	{
		return left;
	}
	public BinaryTree<T> getRight()
	{
		return right;
	}
	
	
	public void attachLeft(BinaryTree<T> tree)
	{
		if (tree==null) return;
		else if (left!=null || tree.getParent()!=null)
		{
			System.out.println("Can't attach");
			return;
		}
		else
		{
			
				tree.setParent(this);
				this.setLeft(tree);
		}
	}
	
	public void attachRight(BinaryTree<T> tree)
	{
		if (tree==null) return;
		else if (right!=null || tree.getParent()!=null)
		{
			System.out.println("Can't attach");
			return;
		}
		else
		{
	
				tree.setParent(this);
				this.setRight(tree);
		}
	}
	
	public BinaryTree<T> detachLeft()
	{
		if (this.isEmpty()) return null;
		BinaryTree<T> retLeft = left;
		left = null;
		if (retLeft!=null) retLeft.setParent(null);
		return retLeft;
	}
	public BinaryTree<T> detachRight()
	{
		if (this.isEmpty()) return null;
		BinaryTree<T> retRight = right;
		right =null;
		if (retRight!=null) retRight.setParent(null);
		return retRight;
	}
	public boolean isEmpty()
	{
		if (data == null)
			return true;
		else
			return false;
	}
	public void clear()
	{
		left = right = parent =null;
		data = null;
	}
	
	public BinaryTree<T> root()
	{
		if (parent == null)
			return this;
		else
		{
			BinaryTree<T> next = parent;
			while (next.getParent()!=null)
				next = next.getParent();
			return next;
		}
	}
	
	public static <T> void preorder(BinaryTree<T> t)
	{
		if (t!=null)
		{
			System.out.print(t.getData()+"\t");
			preorder(t.getLeft());	
			preorder(t.getRight());
		}
	}
	
	public static <T> void inorder(BinaryTree<T> t)
	{
		if (t!=null)
		{
			inorder(t.getLeft());
			System.out.print(t.getData() + "\t");
			inorder(t.getRight());
		}
	}
	
	public static <T> void postorder(BinaryTree<T> t)
	{
		if (t!=null)
		{
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + "\t");
		}
	}
	

}