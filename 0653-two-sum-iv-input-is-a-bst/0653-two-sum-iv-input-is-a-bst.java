class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root,arr);
        int i=0,j=arr.size()-1;
        while(i<j){
            if(arr.get(i)+arr.get(j)==k)
                return true;
            if(arr.get(i)+arr.get(j)>k){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public void helper(TreeNode root,ArrayList arr){
        if(root==null){
            return;
        }
        helper(root.left,arr);
        arr.add(root.val);
        helper(root.right,arr);
    }
}