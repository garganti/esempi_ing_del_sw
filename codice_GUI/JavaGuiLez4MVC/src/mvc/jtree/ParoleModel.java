package mvc.jtree;

import java.util.Enumeration;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class ParoleModel extends DefaultTreeModel{

	public ParoleModel() {
		super(new DefaultMutableTreeNode());
	}
	
	public void add(String string) {
		String iniz = string.substring(0,1);
		TreeNode root = this.root;
		for(int i = 0; i < root.getChildCount(); i++){
			DefaultMutableTreeNode tn = (DefaultMutableTreeNode) root.getChildAt(i);
			String iniziale = (String) tn.getUserObject();
			if (iniziale.equals(iniz)){
				tn.add(new DefaultMutableTreeNode(string));
				System.out.println("adding the child "+ string);
				return;
			}
		}
		System.out.println("adding the node "+ string);
		TreeNode parola = new DefaultMutableTreeNode(string);
		DefaultMutableTreeNode iniziale = new DefaultMutableTreeNode(iniz);
		iniziale.add((MutableTreeNode) parola);	
		insertNodeInto(iniziale, (MutableTreeNode) root, 0);		
	}

}
