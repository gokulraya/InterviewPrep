
public class squareroot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sq=sqrt(10,4,3);
		System.out.println(sq);

	}
public static float sqrt(float x,float high,float low)
{
	 float avg=(high+low)/2;
	 float newavg=avg*avg;
          if(x==0)
               return 0;
          float diff=newavg-x;
          //System.out.println(diff);
            if((newavg - x) < 0.01 || x-newavg > 0.01)
                return newavg;
            
            if(x<newavg)    
            sqrt(x,avg,low); 
            else
            sqrt (x,high,avg);
            
             return 0;  
            
}
}

