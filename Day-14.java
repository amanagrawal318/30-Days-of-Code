// Add your code here
    Difference(int[] arr){
        this.elements=arr;
    }
    public void computeDifference(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<elements.length-1;i++){
            for(int j=i+1;j<elements.length;j++){
                max=Math.max(max,Math.abs(elements[i]-elements[j]));
            }
        }
       this.maximumDifference=max;
    }

} // End of Difference class
