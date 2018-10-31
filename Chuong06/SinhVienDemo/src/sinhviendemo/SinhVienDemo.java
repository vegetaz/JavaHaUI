/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhviendemo;

/**
 *
 * @author Vegetaz
 */
public class SinhVienDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewSinhVien viewsv = new ViewSinhVien();
        viewsv.viewSV();
        SortSinhVien sortsv = new SortSinhVien();
        sortsv.sortSV();
        SearchSinhVien searchsv = new SearchSinhVien();
        searchsv.searchSV();
    }
    
}
