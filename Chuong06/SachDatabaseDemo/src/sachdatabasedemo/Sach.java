/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sachdatabasedemo;

/**
 *
 * @author PM_T7
 */
public class Sach {
    private int idsach;
    private String namesach;
    private float pricesach;
    private String theloaisach;

    public Sach() {
    }

    
    public Sach(int idsach, String namesach, float pricesach, String theloaisach) {
        this.idsach = idsach;
        this.namesach = namesach;
        this.pricesach = pricesach;
        this.theloaisach = theloaisach;
    }

    public int getIdsach() {
        return idsach;
    }

    public String getNamesach() {
        return namesach;
    }

    public float getPricesach() {
        return pricesach;
    }

    public String getTheloaisach() {
        return theloaisach;
    }

    @Override
    public String toString() {
        return "Sach" + "idsach = " + idsach + ", namesach = " + namesach + ", pricesach = " + pricesach + ", theloaisach=" + theloaisach ;
    }
    
}
