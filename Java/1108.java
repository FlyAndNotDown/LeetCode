/**
 * @no 1108
 * @name Defanging an IP Address
 */
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}