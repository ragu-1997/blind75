public class Anagram {
    public static void main (String [] args){
        String s1="silent";
        String s2="listen";
        boolean isAnagram=False;
        boolean [] visited= new boolean[s2.length] 
        int n=s1.length();
        if(s1.length()==s2.length()){
            for(int i=0;i<n;i++){
         char s=s1.charAt[i];
         for(int j=0;j<s2.length();j++){
             if(s2.charAt[j]==c && !visited[j]){
                 visited[j]=True;
                 isAnagram=True;
                 break;
             }
         }
         if(!isAnagram){
             break;
         }
        }
        if(isAnagram){
            System  .out.print("its a anagram");

        }
        else{
            System.out.print("its not anagram");            
        }
    }
    }
    
}