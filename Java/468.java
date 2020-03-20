/**
 * @no 468
 * @name Validate IP Address
 */
class Solution {
    public String validIPAddress(String ip) {
        if (ip.indexOf('.') >= 0 && checkIpv4(ip)) {
            return "IPv4";
        } else if (ip.indexOf(':') >= 0 && checkIpv6(ip)) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }

    private boolean checkIpv4(String ip) {
        int splitCount = 0;
        for (char c : ip.toCharArray()) {
            if (!(c == '.' || c >= '0' && c <= '9')) {
                return false;
            }
            if (c == '.') {
                splitCount++;
            }
        }
        if (splitCount != 3) {
            return false;
        }
        String[] elements = ip.split("\\.");
        if (elements.length != 4) {
            return false;
        }
        for (String element : elements) {
            if (element.isEmpty() || element.length() > 3) {
                return false;
            }
            if (element.charAt(0) == '0' && element.length() != 1) {
                return false;
            }
            int number = Integer.parseInt(element);
            if (number < 0 || number > 255) {
                return false;
            }
        }
        return true;
    }

    private boolean checkIpv6(String ip) {
        int splitCount = 0;
        for (char c : ip.toCharArray()) {
            if (c == ':') {
                splitCount++;
            }
        }
        if (splitCount != 7) {
            return false;
        }
        String[] elements = ip.split(":");
        if (elements.length != 8) {
            return false;
        }
        for (String element : elements) {
            if (element.isEmpty() || element.length() > 4) {
                return false;
            }
            for (char c : element.toCharArray()) {
                if (!(c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F')) {
                    return false;
                }
            }
        }
        return true;
    }
}