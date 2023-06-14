class Solution {
    int print2largest(int arr[], int n) {
        
        int largest=arr[0];
        int secLarge=Integer.MIN_VALUE;
        
        for(int i = 1; i<n; i++){
            
            if (arr[i] > largest){
			    secLarge = largest;
			    largest = arr[i];
		    }

		    else if (arr[i] > secLarge && arr[i] != largest)
		    {
			    secLarge = arr[i];
		    }
        }
        
        if (secLarge == Integer.MIN_VALUE)
            secLarge = -1;
        return secLarge;
    }
}
