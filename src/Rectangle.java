//For a web developer, it is very important to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
//
// 1. The area of the rectangular web page you designed must equal to the given target area.
//
// 2. The width W should not be larger than the length L, which means L >= W.
//
// 3. The difference between length L and width W should be as small as possible.
// You need to output the length L and the width W of the web page you designed in sequence.


public class Rectangle {
    public int[] constructRectangle(int area) {
        int l = 0, b = 0;
        int diff = area;
        int[] result = new int[2];
        for (int i = area; i >= 1; i--) {
            if (area % i == 0 && l >= b) {
                l = i;
                b = area / i;
            }

            if ((l - b) < diff && (l - b) >= 0) {
                diff = l - b;
                result[0] = l;
                result[1] = b;
            }
        }
        return result;
    }
}
