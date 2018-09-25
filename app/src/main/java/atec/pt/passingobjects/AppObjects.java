package atec.pt.passingobjects;

import android.app.Application;

import atec.pt.passingobjects.model.Gaja;

public class AppObjects extends Application {

    Gaja g;


    @Override
    public void onCreate() {
        super.onCreate();
    }

    public Gaja getG() {
        return g;
    }

    public void setG(Gaja g) {
        this.g = g;
    }
}
