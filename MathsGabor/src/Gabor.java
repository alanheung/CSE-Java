/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kfitzgerald
 */

public class Gabor
{
    CreateImage ci;
    private double lamda=0;
    private double theta=0;
    private double varphi=0;
    private double upsi=0;
    private double bandW=0;
    private double B=0;
    private double sigma=0;
    private double kappa=0;
    private double[][] GaborGrid;
    private double[][] GaborNorm;

    int size=0;
    double toRadians=180/Math.PI, min=500, max=-500, mean=0;;
    int gaussian=0;
    double rotation;
    double GLFmean=0;
    //Standard Gabor no quantization
    public Gabor(double l, double t, double v, double u, double b, int sze)
    {
        lamda=l;
        theta=t/toRadians;
        varphi=v/toRadians;
        upsi=u;
        bandW=b;
        kappa=(2*Math.PI)/lamda;
        Calculate_Sigma();
        size=sze;
        gaussian=sze/2;
        GaborGrid = new double[size][size];
        GaborNorm = new double[size][size];
        RunGabor();
        NormaliseImage();
    }
    public void RunGabor()
    {
        double X=0,Y=0, gx=-gaussian,gy=-gaussian, count=0, total=0;
        int ax=0, dy=0;
        for(int y=-gaussian; y<=gaussian; y++)
        {
            for(int x=-gaussian; x<=gaussian; x++)
            {
                X=gx*Math.cos(theta)+gy*Math.sin(theta);
                Y=-gx*Math.sin(theta)+gy*Math.cos(theta);
                GaborGrid[dy][ax]=(Math.exp(-(Math.pow(X, 2)+(Math.pow(Y, 2)*
                        Math.pow(upsi,2)))/(2*Math.pow(sigma, 2))))*
                        (Math.cos((kappa*X+varphi)));
                total+=GaborGrid[dy][ax];
                count++;
                gx+=1;
                ax+=1;
            }
            ax=0;
            dy+=1;
            gy+=1;
            gx=-gaussian;
        }
        mean=total/count;
    }
    public void NormaliseImage()
    {
        double temp;
        double average=0;
        for(int y=0; y<GaborGrid.length; y++)
        {
            for(int x=0; x<GaborGrid[0].length; x++)
            {
                if(GaborGrid[y][x]<min)
                    min=GaborGrid[y][x];

                if(GaborGrid[y][x]>max)
                    max=GaborGrid[y][x];
            }
        }
        for(int y=0; y<GaborNorm.length; y++)
        {
            for(int x=0; x<GaborNorm[0].length; x++)
            {
                temp = ((((double)(GaborGrid[y][x]-min))/((double)(max-min)))*255);
                if(temp<=(int)average)
                {
                    temp=0;
                }
                GaborNorm[y][x]=temp;
            }
        }
        ci = new CreateImage(GaborNorm, "Gabor");
    }
    private void Calculate_Sigma()
    {
        B=(1/Math.PI)*(0.588705011)*((Math.pow(2, bandW)+1)/(Math.pow(2, bandW)-1));
        sigma=B*lamda;
    }
}
