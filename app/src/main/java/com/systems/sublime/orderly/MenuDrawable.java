package com.systems.sublime.orderly;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Rick on 1/29/2017.
 */

public class MenuDrawable extends View {
    private ShapeDrawable mDrawable;

    /**
     * Simple constructor to use when creating a view from code.
     *
     * @param context The Context the view is running in, through which it can
     *                access the current theme, resources, etc.
     */
    public MenuDrawable(Context context) {
        super(context);
        int x = 50;
        int y = 50;
        int height = 50;
        int width = 30;

        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(0x000000);
        mDrawable.setBounds(x, y, x+width, y+height);
    }

    protected void onDraw(Canvas canvas) {
        mDrawable.draw(canvas);
    }
}
