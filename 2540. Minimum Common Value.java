class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        if(nums1[nums1.length-1]<nums2[0] || nums2[nums2.length-1]<nums1[0])
        return -1;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]) return nums1[i];
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        return -1;
        // Set<Integer> set1=new HashSet<>();
        // Set<Integer> set2=new HashSet<>();
        // for(int num:nums1) set1.add(num);
        // for(int num:nums2) set2.add(num);
        // set1.retainAll(set2);
        // List<Integer> arr=new ArrayList<>(set1);
        // Collections.sort(arr);
        // if(arr.size()>=1) return arr.get(0);
        // return -1;
    }
}
