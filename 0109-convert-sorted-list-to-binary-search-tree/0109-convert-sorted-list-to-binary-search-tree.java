
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> a1=new ArrayList<>();
        while(head!=null){
            a1.add(head.val);
            head=head.next;
        }
        return helper(a1,0,a1.size()-1);
    }
     public TreeNode helper(ArrayList<Integer> nums, int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums.get(mid));
        root.left=helper(nums,start,mid-1);
        root.right=helper(nums,mid+1,end);
        return root;
    }
}