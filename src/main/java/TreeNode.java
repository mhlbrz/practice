import java.util.ArrayList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "{" + val + '}';
    }

    public static ArrayList<ArrayList<TreeNode>> treeToArrays(TreeNode root) {
        ArrayList<ArrayList<TreeNode>> arrs = new ArrayList<>();
        recurArraysBuilder(arrs, 1, 0, root);
        return arrs;
    }

    private static void recurArraysBuilder(ArrayList<ArrayList<TreeNode>> arrs, int depth, int ind, TreeNode n) {
        if (n == null) return;
        if (arrs.size() < depth) {
            arrs.add(new ArrayList<>((int) Math.pow(2, depth-1)));
        }
        arrs.get(depth - 1).add(ind, n);
        recurArraysBuilder(arrs, depth + 1, ind*2, n.left);
        recurArraysBuilder(arrs, depth + 1, ind*2 + 1, n.right);
    }

    public static void printTree(TreeNode n) {
        ArrayList<ArrayList<TreeNode>> arrs = treeToArrays(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrs.size(); i++) {
            ArrayList<TreeNode> row = arrs.get(i);
            sb.append(row.toString());
            sb.append('\n');
            ArrayList<String> links = new ArrayList<>(row.size()*2);
            for (int j = 0; j < row.size()*2; j++) {
                TreeNode tn = row.get(j/2);
                if (j % 2 == 1){
                    if (tn != null && tn.right != null){
                        links.add(j, "\\");
                    } else {
                        links.add(j, " ");
                    }
                } else {
                    if (tn != null && tn.left != null){
                        links.add(j, "|");
                    } else {
                        links.add(j, " ");
                    }
                }
            }
            sb.append(links.toString());
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int size = 20;
        TreeNode[] nodes = new TreeNode[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new TreeNode(i);
        }
        for (int i = 0; i < size/2; i++){
            int left = i*2+1;
            int right = i*2+2;
            if (left < size) {
                nodes[i].left = nodes[left];
            }
            if (right < size) {
                nodes[i].right = nodes[right];
            }
        }
        printTree(nodes[0]);
    }
}

