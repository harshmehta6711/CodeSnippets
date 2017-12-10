class DecToHex {
    public String toHex(int num) {
        StringBuilder hexString = new StringBuilder();
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if (num == 0) return "0";
        while (num > 0) {
            int rem = num % 16;
            hexString.append(hex[rem]);
            num = num / 16;
        }
        return hexString.reverse().toString();
    }

    public static void main(String[] args) {
        DecToHex obj1 = new DecToHex();
        String result = "";
        result = obj1.toHex(36);
        System.out.println(result);
    }
}