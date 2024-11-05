class First{
    public static boolean checkPrime(int n){
        for(int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int sum=0;
        for(int i=0 ;i<args.length;i++)
        {
             boolean isprime=checkPrime(Integer.parseInt(args[i]));
             if(isprime)
             {
                sum=sum+Integer.parseInt(args[i]);
             }
        }   
        System.out.println(sum);   
    }
}