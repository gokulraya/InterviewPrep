
public class treeImpl {

	/**
	 * @param args
	 */
	public treeImpl left;
	public treeImpl right;
	public int value;
	
	public treeImpl(treeImpl left,treeImpl right,int value)
	{
		this.left=left;
		this.right=right;
		this.value=value;
	}
	
	public treeImpl getLeft()
	{
		return left;
	}
	
	public treeImpl getRight()
	{
		return right;
	}
	
	public int getValue()
	{
		return value;
	}
}
