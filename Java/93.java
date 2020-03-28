/**
 * @no 93
 * @name Restore IP Addresses
 */
class Solution {
    private List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        restoreIpAddressInternal(s, 0, new ArrayList<>());
        return result;
    }

    private void restoreIpAddressInternal(String s, int dotCount, List<String> current) {
        if (dotCount == 3) {
            if (s.length() > 3) {
                return;
            }
            current.add(s);
            checkIpAddress(current);
            return;
        }
        if (s.length() > 1) {
            List<String> t = new ArrayList<>(current);
            t.add(s.substring(0, 1));
            restoreIpAddressInternal(s.substring(1), dotCount + 1, t);
        }
        if (s.length() > 2) {
            List<String> t = new ArrayList<>(current);
            t.add(s.substring(0, 2));
            restoreIpAddressInternal(s.substring(2), dotCount + 1, t);
        }
        if (s.length() > 3) {
            List<String> t = new ArrayList<>(current);
            t.add(s.substring(0, 3));
            restoreIpAddressInternal(s.substring(3), dotCount + 1, t);
        }
    }

    private void checkIpAddress(List<String> ipAddress) {
        if (ipAddress.size() != 4) {
            return;
        }
        for (String numberString : ipAddress) {
            if (numberString.startsWith("0") && numberString.length() != 1) {
                return;
            }
            if (numberString.isEmpty()) {
                return;
            }
            int number = Integer.parseInt(numberString);
            if (number < 0 || number > 255) {
                return;
            }
        }
        addToResult(ipAddress);
    }

    private void addToResult(List<String> ipAddress) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ipAddress.size(); i++) {
            stringBuilder.append(i == ipAddress.size() - 1 ? ipAddress.get(i) : String.format("%s.", ipAddress.get(i)));
        }
        result.add(stringBuilder.toString());
    }
}