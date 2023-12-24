//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                String str=br.readLine();
                String[] starr=str.split(" ");
                
                //input n and d
                int n=Integer.parseInt(starr[0]);
                int k= Integer.parseInt(starr[1]);
                
                starr = br.readLine().trim().split(" ");
                int[] price = new int[n];
                for(int i = 0; i < n; i++)
                    price[i] = Integer.parseInt(starr[i]);
                
                Solution obj = new Solution();
                int res = obj.buyMaximumProducts(n, k, price);
                
                System.out.println(res);
                
            }
        }
    }
    
    // } Driver Code Ends
    
    class Stock implements Comparable<Stock>{
        public int price;
        public int index;
        
        public Stock(int p, int i){
            this.price = p;
            this.index = i;
        }
        
        public int compareTo(Stock o2){
            return this.price - o2.price;
        }
    }
    
    class Solution {
        public static int buyMaximumProducts(int n, int k, int[] price) {
            Stock[] arr = new Stock[n];
            
            for(int i = 0; i<n; i++){
                arr[i] = new Stock(price[i], i + 1);
            }
            
            Arrays.sort(arr);
            
            int count = 0;
            for(Stock s: arr){
                int maxBuy = Math.min(k/s.price, s.index);
                
                k -= s.price*maxBuy;
                count += maxBuy;
            }
            
            return count;
        }
    }
            
    