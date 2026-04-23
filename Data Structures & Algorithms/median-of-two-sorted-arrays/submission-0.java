class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, i = 0, j = 0, k = 0;
        int []arr = new int[m+n];

        double median = 0;

        while(i < m && j < n)
        {
            if(nums1[i] <= nums2[j])
            {
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }

        while(i < m) arr[k++] = nums1[i++];

        while(j < n) arr[k++] = nums2[j++];

        System.out.println(Arrays.toString(arr));

        int mid = ((m + n)/2) ;
        System.out.println(mid);
        if((m + n)%2 == 0) median = (double)(arr[mid-1] + arr[mid]) /2;
        else median = arr[mid];

        return median;
    }
}
