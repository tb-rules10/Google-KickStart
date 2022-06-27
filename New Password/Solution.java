import java.util.*;

public class Solution{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        char ch,ua,la,dig,sym;
        String symbols="#@*&";
        for(int a0 = 1; a0 <= t; a0++){
            int l = in.nextInt();
            String p = in.next();
            ua='A'; la='a'; dig='1'; sym='@';
            for(int i=0;i<l;i++){
                ch=p.charAt(i);
                if(ch>='A' &&ch<='Z'){ua='\u0000';}
                if(ch>='a' &&ch<='z'){la='\u0000';}
                if(Character.getNumericValue(ch)>=0 && Character.getNumericValue(ch)<=9){dig='\u0000';}
                if(symbols.indexOf(ch)>=0){sym='\u0000';}
            }
            if(ua!='\u0000') p+=ua;
            if(la!='\u0000') p+=la;
            if(dig!='\u0000') p+=dig;
            if(sym!='\u0000') p+=sym;
            if(p.length()<8){
                p = p + "1".repeat(7-p.length());
            }
            System.out.println("Case #"+a0+": "+p);
        }
    }
}
