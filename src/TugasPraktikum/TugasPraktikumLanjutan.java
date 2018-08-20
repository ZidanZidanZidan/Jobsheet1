/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ZIDANE
 */
public class TugasPraktikumLanjutan {
    public static void main(String[]args){
        int z=4;
        for(int a=1;a<=5;a++){
            if(a==1||a==5){
                for(int b=1;b<=5;b++){
                    System.out.print("@");
                }
            }
            else{
                for(int b=1;b<=5;b++){
                    if(b==z){
                        System.out.print("@");
                    }
                    else {System.out.print(" ");
                }
            }
                z--;
        }
         System.out.println(" ");   
    }
    

    System.out.println("");
    
    int k,l,m,n;
    for (k=1;k<=5;k++){
            for(l=2;l<=1;l++){
                System.out.print("@");
            }
            for(m=1;m<=0;m++){
                if(k==m){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(n=1;n<=2;n++){
                System.out.print("@");
            }
            System.out.println();
}
    System.out.println();
    
    for (int sp=0;sp<2;sp++){
        System.out.println();
    }// 
    int r1;
    for(r1=0;r1<3;r1++){
        System.out.print("@");
        int ar;
        for(ar=0;ar<r1;ar++){ System.out.print(" "); }
        System.out.println();
        System.out.print("@");
        for(int j=6;j>3;j--){
            System.out.print(" ");
        }
    System.out.println("@");
    }
    for(int d=0;d<4;d++){
        System.out.print("@");
    }
    System.out.println();
    
    for(int sp=0;sp<2;sp++){
        System.out.println("");
    }
    for(int sp=0;sp<5;sp++){
        System.out.print(" ");
    }
    System.out.println("@");//baris 1
    for(int sp2=0;sp2<3;sp2++){
        System.out.print(" ");
    }
    System.out.print("@");
    for(int sp=0;sp<2;sp++){
        System.out.print(" ");
    }
    System.out.println("@");//baris 2
    for(int sp=0;sp<2;sp++){
    System.out.print(" ");
}
    System.out.print("@");
    for(int sp2=0;sp2<3;sp2++){
        System.out.print("@");
    }
    System.out.println();//baris 3
    for(int sp2=0;sp2<1;sp2++){
        System.out.print(" ");
    }
    System.out.print("@");
    for(int sp2=0;sp2<7;sp2++){
        System.out.print(" ");
    }
    System.out.println("@");//baris 4
    System.out.print("@");
    for(int sp2=0;sp2<9;sp2++){
        System.out.print(" ");
    }
    System.out.println("@");//baris 5
    
    System.out.println();
    
    int q,w,e,r;
    for (q=1;q<=4;q++){
        for(w=1;w<=1;w++){
            System.out.print("@");
        }
        for(e=2;e<=3;e++){
            if(q==e){
                System.out.print("@");
            }
            else{System.out.print(" ");}
        }
        for(r=1;r<=1;r++){
            System.out.print("@");
        }
        System.out.println();
    }
    for(int sp = 0;sp<2;sp++){
        System.out.println("");
    }//spasi
    for(int c=0;c<5;c++){
        System.out.print("@");
    }
    System.out.println("");
    for(int cb=0;cb<1;cb++){
        for(int cba=0;cba<2;cba++){
            System.out.print("@");
        }
        System.out.println("");
    }
    for(int c=0;c<5;c++){
        System.out.print("@");
    }
    System.out.println("");
    for(int cb=0;cb<1;cb++){
        for(int cba=0;cba<2;cba++){
            System.out.print("@");
        }
        System.out.println("");
    }
    for(int c=0;c<5;c++){
        System.out.print("@");
    }
    System.out.println();
    
    }
}

