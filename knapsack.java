import java.util.*;

public class knapsack {

    public static void main(String[] args) {
        
    
    int val[] = {60,100,120};
    int weight[] = {10,20,30};

    int totalweight = 50 ;

    double ratio[][] = new double[val.length][2];

    for(int i =0 ;i<val.length;i++){
        ratio[i][0] = i ;
        ratio[i][1] = (double)(val[i] / weight[i]) ; 
    }

    Arrays.sort(ratio , Comparator.comparing( o -> o[1]));  // ascending order

    int finaval = 0 ;

    for(int i = ratio.length-1 ; i>=0 ; i--){
        int idx = (int) ratio[i][0];
    

    if(totalweight>=weight[idx]){
        finaval += val[idx];

        totalweight -= weight[idx];
    }

    else{
        finaval += (ratio[i][1]*totalweight);
        
        totalweight = 0 ;

        break;
    }
    }

    System.out.println("MAX VALUE IS :" + finaval);
    }
}
