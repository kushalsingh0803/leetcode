package simple;

public class FloodFill {


    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int initValue = image[sr][sc];
            if( initValue == color) return  image;
            floodFillHelper(image, sr, sc, initValue, color);
            return image;
        }

        public void floodFillHelper(int[][]image, int sr, int sc, int value, int newColor){

            if(sr < 0 || sc < 0 || sr > image.length - 1 || sc > image[0].length - 1 || image[sr][sc]!=value){
                return;
            }

            if(image[sr][sc] == value){
                image[sr][sc] = newColor;
                floodFillHelper(image, sr+1, sc, value, newColor);
                floodFillHelper(image, sr-1, sc, value, newColor);
                floodFillHelper(image, sr, sc+1, value, newColor);
                floodFillHelper(image, sr, sc-1, value, newColor);
            }
        }
    }
}
