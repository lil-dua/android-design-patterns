package tech.demoproject.android_design_patterns.structural_patterns.adapter;

/***
 * Created by HoangRyan aka LilDua on 10/19/2022.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
