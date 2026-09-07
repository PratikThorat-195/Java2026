// Compound Opeartor
public class Compound_Assignment
{
    public static void main(String[] args) 
    {
        // ==================
        // +=
        // ==================
        int a = 20, b = 10;
        System.out.println("+= : a = a+b : "+ (a+=b)); // += : a = a+b : 30
        a+=-5;
        System.out.println("+= : a = a+(-5) : "+ (a)); // += : a = a+(-5) : 25
        System.out.println("----------------------------------------------------------------");
        int c = 30;
        int d = c;
        c+=d;
        System.out.println("+= : c = c+d : "+c);      // += : c = c+d : 60
        System.out.println("=================================================================");
        
        // ==================        
        // -=
        // ==================
        int x = 40, y = 20;
        x-=y;
        System.out.println("-= : x = x-y : "+(x)); // -= : x = x-y : 20
        System.out.println("----------------------------------------------------------------");
        int aa = 50;
        int bb = aa;
        aa-=bb; 
        System.out.println("-= : aa = aa-bb : "+(aa)); // -= : aa = aa-bb : 0
        System.out.println("=================================================================");
        
        // ===================
        // *=
        // ===================
        int cc = 30, dd = 50;
        cc*=dd;
        System.out.println("*= : cc = cc * dd : "+cc); // *= : cc = cc * dd : 1500
        int xx = 90;
        xx*=-8;
        System.out.println("*= : xx = xx * -8 : "+xx); // *= : xx = xx * -8 : -720

        System.out.println("=================================================================");

        // ===================
        // /=
        // ===================
        int pp = 90, qq = 10;
        pp/=qq;
        System.out.println("/= : pp = pp / qq : "+pp); // /= : pp = pp / qq : 9

        System.out.println("=================================================================");
        
        // ===================
        // %=
        // ===================
        int ee = 90, ff = 10;
        ee%=ff;
        System.out.println("%= : ee = ee % ff : "+ee); // %= : ee = ee % ff : 0
    }
}