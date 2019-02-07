/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public String serialize(TreeNode root) {
        return serializeHelper(root,"");
    }

    //Doing PreOrder
    private String serializeHelper(TreeNode root, String str){
        if (root == null){
            str +="null,";
            return str;
        }
        // preorder add node
        str += root.val + ",";
        str = serializeHelper(root.left, str);
        str = serializeHelper(root.right, str);
        //System.out.println(str);
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_ = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(data_));
        return desHelper(list);
    }

    private TreeNode desHelper(List<String> list){
        if (list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        int val = Integer.valueOf(list.get(0));
        TreeNode root = new TreeNode(val);
        list.remove(0);
        root.left = desHelper(list);
        root.right = desHelper(list);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
