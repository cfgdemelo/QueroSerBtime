package br.com.dojo.cfgdemelo.dojopuzzle.presenter;

import br.com.dojo.cfgdemelo.dojopuzzle.model.Calculate;
import br.com.dojo.cfgdemelo.dojopuzzle.view.MainActivity;

/**
 * Created by caio.melo on 15/03/18.
 */

public class Presenter {

    private MainActivity view;
    private Calculate model;

    public Presenter(MainActivity view) {
        this.view = view;
        this.model = new Calculate();
    }

    public void onButtonPressed(Integer number) {
        boolean answer = model.calculateHappinness(number);
        if (answer) {
            view.changeImgHappy();
        } else {
            view.changeImgSad();
        }
    }
}
