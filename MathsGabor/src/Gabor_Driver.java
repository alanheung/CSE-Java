/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kfitzgerald
 */
public class Gabor_Driver
{
    public static void main(String[]args)
    {
        double lamda=75;
        double theta=45;
        double varphi=90;
        double upsi=1;
        double bandW=1;
        int size=301;
        Gabor gabor = new Gabor(lamda, theta, varphi, upsi, bandW, size);
    }
}
