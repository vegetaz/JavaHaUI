/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package databasedemo;

/**
 *
 * @author PM_T7
 */
class User {
    private int id;
    private String iname;
    private String upassword;
    private String uright;

    public User() {
    }

    public User(int id, String iname, String upassword, String uright) {
        this.id = id;
        this.iname = iname;
        this.upassword = upassword;
        this.uright = uright;
    }

    public int getId() {
        return id;
    }

    public String getIname() {
        return iname;
    }

    public String getUpassword() {
        return upassword;
    }

    public String getUright() {
        return uright;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", iname=" + iname + ", upassword=" + upassword + ", uright=" + uright + '}';
    }
    
}
