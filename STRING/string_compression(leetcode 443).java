public int compress(char[] chars) {
    int n = chars.length;
    int s = 0, i = 0;
    while (i < n) {
        int j = i, count = 0;
        while (j < n && chars[i] == chars[j]) {
            count++;
            j++;
        }
        chars[s++] = chars[i];
        if (count > 1) {
            char[] numChars = (count + "").toCharArray();
            for (char c : numChars) chars[s++] = c;
        }
        i = j;
    }
    
    return s;
}
}