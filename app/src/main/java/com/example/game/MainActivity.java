package com.example.game;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private View board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(board == null) {
            board = findViewById(R.id.board);
        }
        int width = board.getWidth();
        int height = board.getHeight();
        Canvas canvas = new Canvas();
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawLine(0,0,width,height,paint);
        board.draw(canvas);
    }

}