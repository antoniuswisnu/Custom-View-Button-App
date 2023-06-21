package com.example.no1;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

public class CustomButton extends AppCompatButton {

    boolean changeColor = false;
    private int txtColor = ContextCompat.getColor(getContext(), R.color.white);


    public CustomButton(@NonNull Context context) {
        super(context);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.teal_200));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!changeColor){
                    setBackgroundColor(ContextCompat.getColor(getContext(), R.color.teal_200));
                    changeColor = true;
                } else {
                    setBackgroundColor(ContextCompat.getColor(getContext(), R.color.purple_200));
                    changeColor = false;
                }
            }
        });
        setTextColor(txtColor);
        setTextSize(12f);
        setGravity(Gravity.CENTER);
    }

}
