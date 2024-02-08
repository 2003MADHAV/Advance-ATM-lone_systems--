package code_java;
import java.util.Scanner;
public class Madhav_Bingoo_Game
{
    public static void main(String[] args)
    {
        System.out.println("WELCOME TO BINGO GAME!!");
        int a[][]=new int[5][5];
        int b[][]=new int[5][5];
        Scanner s=new Scanner(System.in);
        int c[]={0,0,0,0,0};
        int d[]={0,0,0,0,0};
        int e[]={0,0,0,0,0};
        int f[]={0,0,0,0,0};
        int g,h=0,l=0,m=0,n=0,p=0,q=0,r=0,x=0;
        int i,j,k;
        for(i=0;i<20;i++)
        { if(i==0) System.out.println("NUMBER SELECTED BY  PLAYER1:");
            if(i==5) System.out.println("NUMBER SELECTED BY  PLAYER2:");
            if(i==10) System.out.println("THE DETAILS OF PLAYER1:");
            if(i==15) System.out.println("THE DETAILS OF PLAYER2:");
            for(j=0;j<5;j++)
            {
                if(i<5) a[i][j]=s.nextInt();
                if(i>=5 && i<10) b[i-5][j]=s.nextInt();
                if(i>=10 && i<15) System.out.print(a[i-10][j]+" ");
                if(i>=15 && i<20) System.out.print(b[i-15][j]+" ");
            }
            System.out.println();
        }
        System.out.println("ENTER THE RANDOM NUMBERS BY PLAYERS:");
        for(k=0;k<25;k++){
            g=s.nextInt();
            for(i=0;i<5;i++)
            { for(j=0;j<5;j++)
            { if(a[i][j]==g) c[i]++;
                if(b[i][j]==g) e[i]++;
                if(a[j][i]==g) d[i]++;
                if(b[j][i]==g) f[i]++;
                if(a[i][j]==g && i==j) l++;
                if(b[i][j]==g && i==j) m++;
                if(a[i][j]==g && i+j==4) n++;
                if(b[i][j]==g && i+j==4) p++;
            }
            }
            for(i=0;i<5;i++)
            { if(c[i]==5) {q++;c[i]=0;}
                if(d[i]==5) {q++;d[i]=0;}
                if(e[i]==5) {r++;e[i]=0;}
                if(f[i]==5) {r++;f[i]=0;}
            }
            if(l==5) {q++;l=0;}
            if(n==5) {q++;n=0;}
            if(m==5) {r++;m=0;}
            if(p==5) {r++;p=0;}
            if(q==5 && r==5)
            {System.out.println("!!DRAW!!");
                break;
            }
            if(q==5)
            {System.out.println("PLAYER1 WIN !!");
                break;
            }
            if(r==5)
            {System.out.println("PLAYER2 WIN !!");
                break;
            }
        }
    }
}
