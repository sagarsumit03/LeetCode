class Solution {
    public String defangIPaddr(String address) {
        if (address == null) {
            return address;
        }
        char c[] = address.toCharArray();
        address = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '.') {
                address += "[.]";
            } else {
                address += c[i];
            }
        }
        return address;
    }
}
