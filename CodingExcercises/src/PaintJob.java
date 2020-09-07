public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        double area = width * height;
        double bucketarea = areaPerBucket * extraBuckets;
        double actualarea =  area - bucketarea ;
        double bucketrequired = actualarea / areaPerBucket;
        double bucket1 = Math.ceil(bucketrequired);



        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)){
            return -1;
        }else{
            return (int) bucket1;

        }

    }
    public static int getBucketCount(double width , double height , double areaPerBucket ){
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0)){
            return -1 ;
        }
        else{
            double area = width * height;
            double bucketrequired = area / areaPerBucket;
            double bucket1 = Math.ceil(bucketrequired);

            return (int) bucket1;
        }
    }
    public static int getBucketCount(double area , double areaPerBucket){
        if(area <=0 || areaPerBucket <= 0){
            return -1;
        }



        else{
            double bucketrequired = area / areaPerBucket;
            double bucket1 = Math.ceil(bucketrequired);

            return (int) bucket1;
        }
    }

}
