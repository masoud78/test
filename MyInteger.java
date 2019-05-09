

public class MyInteger {

    int value;
    
    public MyInteger(int specified){
        value = specified;
    }
    int getvalue(){
        return value;
    }
    boolean isodd(){
        if(value%2!=0)return true;
        return false;
    }
    boolean iseven(){
        if(value%2==0)return true;
        return false;
    }
    boolean isprime(){
        int k=0;
        for(int i=2 ; i<value ; i++){
            if(value%i==0){
                k=1;
            }
        }
        if(k==0)return true;
        return false;
    }
    static boolean iseven(int a){
        if(a%2==0)return true;
        return false;
    }
    static boolean isodd(int a){
        if(a%2!=0)return true;
        return false;
    }
    static boolean isprime(int a){
        int k=0;
        for(int i=2 ; i<a ; i++){
            if(a%i==0){
                k=1;
            }
        }
        if(k==0)return true;
        return false;
    }
    static boolean iseven(MyInteger a){
        if(a.getvalue()%2==0)return true;
        return false;
    }
    static boolean isodd(MyInteger a){
        if(a.getvalue()%2!=0)return true;
        return false;
    }
    static boolean isprime(MyInteger a){
        int k=0;
        for(int i=2 ; i<a.getvalue() ; i++){
            if(a.getvalue()%i==0){
                k=1;
            }
        }
        if(k==0)return true;
        return false;
    }
    boolean equals(int a){
        if(a==value)return true;
        return false;
    }
    boolean equals(MyInteger a){
        if(a.getvalue()==value)return true;
        return false;
    }
    int parseInt(String str){
       return Integer.parseInt(str);
    }
    int parseInt(char[] str){
       String str2 = String.valueOf(str);
       return Integer.parseInt(str2);
    }
    
    
    
    
    public static void main(String[] args) {
        
    }
    
}
