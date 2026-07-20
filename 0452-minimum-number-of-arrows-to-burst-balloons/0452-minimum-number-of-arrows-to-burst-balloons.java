class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));


        int arrows = 1;

        int arrowpos = points[0][1];

         // edge case
        if(points.length == 0) return 0;


        for(int i = 1; i < points.length; i++){
              
              // current arrow is not inside the ballon
            if(arrowpos < points[i][0]){

                arrows++;

                arrowpos = points[i][1];
            }
        }
        return arrows;
    }
}