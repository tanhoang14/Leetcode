class Solution {
   public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];

        if (oldColor != newColor) {
            fill(image, sr, sc, oldColor, newColor);
        }

        return image;
        }

        private void fill(int[][] image, int r, int c, int oldColor, int newColor) {
        if (image[r][c] == oldColor) {
            image[r][c] = newColor;

            if (r > 0) fill(image, r - 1, c, oldColor, newColor);
            if (c > 0) fill(image, r, c - 1, oldColor, newColor);
            if (r < image.length - 1) fill(image, r + 1, c, oldColor, newColor);
            if (c < image[0].length - 1) fill(image, r, c + 1, oldColor, newColor);
        }
        }

}
