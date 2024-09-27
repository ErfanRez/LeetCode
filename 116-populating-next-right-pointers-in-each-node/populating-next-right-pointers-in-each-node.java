/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node head = root;
        for(; root != null; root = root.left) 
            for(Node cur = root; cur != null; cur = cur.next) 
                if(cur.left != null) {
                    cur.left.next = cur.right;
                    if(cur.next != null) cur.right.next = cur.next.left;
                } else break;
        
        return head;
    }
}

//Recursive using DFS (Space not optimized!)

// public Node connect(Node root) {
//         if(root == null) return null;

//         Node L = root.left, R = root.right, N = root.next;
//         if(L != null){
//             L.next = R;
//             if(N != null) R.next = N.left;
//             connect(L);
//             connect(R);
//         }

//         return root;
//     }

/////////////////////////////////////////

// Using BFS (Space Not Optimized!)

// public Node connect(Node root) {
//         if(root == null) return null;

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);

//         while(!q.isEmpty()){
//             Node rightNode = null;

//             for(int i = q.size(); i > 0; i--){
//                 Node curr = q.poll();
//                 curr.next = rightNode;
//                 rightNode = curr;
//                 if(curr.right != null){
//                     q.add(curr.right);
//                     q.add(curr.left);
//                 }
//             }
//         }

//         return root;
//     }