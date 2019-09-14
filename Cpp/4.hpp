/**
 * @no 4
 * @name Median of Two Sorted Arrays
 */
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int last, count = -1;
        int size1 = (int) nums1.size(), size2 = (int) nums2.size(), size = size1 + size2;
        while (!nums1.empty() || !nums2.empty()) {
            count++;
            if (nums1.empty()) {
                last = nums2.back();
                nums2.pop_back();
            } else if (nums2.empty()) {
                last = nums1.back();
                nums1.pop_back();
            } else {
                int num1 = nums1.back();
                int num2 = nums2.back();
                if (num1 > num2) {
                    last = num1;
                    nums1.pop_back();
                } else {
                    last = num2;
                    nums2.pop_back();
                }
            }

            if (size % 2 == 0) {
                if (count == size / 2 - 1) {
                    if (nums1.empty()) {
                        return (last + nums2.back()) * 1.0 / 2;
                    } else if (nums2.empty()) {
                        return (last + nums1.back()) * 1.0 / 2;
                    } else {
                        if (nums1.back() > nums2.back()) {
                            return (last + nums1.back()) * 1.0 / 2;
                        } else {
                            return (last + nums2.back()) * 1.0 / 2;
                        }
                    }
                }
            } else {
                if (count == size / 2) return last;
            }
        }
        return 0;
    }
};
