package saic.demo.excercise

class ReverseString {
    static String reverseString(String str) {
        def chars = str.getChars()
        for (int i = 0; i < chars.length / 2; i++) {
            chars.swap(i, chars.length - 1 - i)
        }
        return new String(chars)
    }
}
