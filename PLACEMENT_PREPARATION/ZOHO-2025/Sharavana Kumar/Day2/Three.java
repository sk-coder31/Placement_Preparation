class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs = new HashSet<>();
       for(int i : nums1){
           hs.add(i);
       }
       ArrayList<Integer>arr = new ArrayList<>();
       for(int i:nums2){
           if(hs.contains(i)){
                arr.add(i);
                hs.remove(i);
           }
       }
       int[] res = new int[arr.size()];
       int k =  0;
       for(int i : arr){
           res[k]=i;
           k++;
       }
       return res;
        
    }
}
