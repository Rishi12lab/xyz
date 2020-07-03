package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity {

        private Button[][] buttons=new Button[3][3];
        private Button[][] field=new Button[3][3];
        private Button zero;
        private Button one;
        private Button two;
        private Button three;
        private Button four;
        private Button five;
        private Button six;
        private Button seven;
        private Button eight;
        private Button nine;
        private Button reset;
        private TextView player1;
        private TextView player2;
        private Boolean player1turn=true;
        private int roundcount=0;
        private int player1points;
        private int player2points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero=(Button)findViewById(R.id.btn00);
        one=(Button)findViewById(R.id.btn01);
        two=(Button)findViewById(R.id.btn02);
        three=(Button)findViewById(R.id.btn10);
        four=(Button)findViewById(R.id.btn11);
        five=(Button)findViewById(R.id.btn12);
        six=(Button)findViewById(R.id.btn20);
        seven=(Button)findViewById(R.id.btn21);
        eight=(Button)findViewById(R.id.btn22);
        player1=(TextView)findViewById(R.id.tvplayer1);
        player2=(TextView)findViewById(R.id.tvplayer2);
        reset=(Button)findViewById(R.id.btnreset);
        buttons[0][0]=zero;
        buttons[0][1]=one;
        buttons[0][2]=two;
        buttons[1][0]=three;
        buttons[1][1]=four;
        buttons[1][2]=five;
        buttons[2][0]=six;
        buttons[2][1]=seven;
        buttons[2][2]=eight;
            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset();
                }
            });


        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {


                        if(player1turn){
                            zero.setText("X");
                        }
                        else{
                            zero.setText("O");
                            zero.setTextColor(R.color.colorPrimaryDark);
                        }
                if(!zero.getText().toString().equals(""))
                    zero.setEnabled(false);


                roundcount++;

                checkforwin();
                if(roundcount==9)
                    draw();

                }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if(player1turn){
                    one.setText("X");
                }
                else{
                    one.setText("O");
                    one.setTextColor(R.color.colorPrimaryDark);
                }
                if(!one.getText().toString().equals(""))
                    one.setEnabled(false);


                roundcount++;
                checkforwin();
                if(roundcount==9)
                    draw();
            }});

        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if(player1turn){
                    two.setText("X");
                }
                else{
                    two.setText("O");
                    two.setTextColor(R.color.colorPrimaryDark);
                }
                if(!two.getText().toString().equals(""))
                    two.setEnabled(false);



                roundcount++;
                checkforwin();
                if(roundcount==9)
                    draw();
            }});

        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if(player1turn){
                    three.setText("X");
                }
                else{
                    three.setText("O");
                    three.setTextColor(R.color.colorPrimaryDark);
                }
                if(!three.getText().toString().equals(""))
                    three.setEnabled(false);
                    roundcount++;

                checkforwin();
                if(roundcount==9)
                    draw();

            }});

        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if(player1turn){
                    four.setText("X");
                }
                else{
                    four.setText("O");
                    four.setTextColor(R.color.colorPrimaryDark);
                }
                if(!four.getText().toString().equals(""))
                    four.setEnabled(false);



                roundcount++;
                checkforwin();
                if(roundcount==9)
                    draw();
            }});

        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if(player1turn){
                    five.setText("X");
                }
                else{
                    five.setText("O");
                    five.setTextColor(R.color.colorPrimaryDark);
                }
                if(!five.getText().toString().equals(""))
                    five.setEnabled(false);


                roundcount++;
                checkforwin();
                if(roundcount==9)
                    draw();
            }});

        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if(player1turn){
                    six.setText("X");
                }
                else{
                    six.setText("O");
                    six.setTextColor(R.color.colorPrimaryDark);
                }
                if(!six.getText().toString().equals(""))
                    six.setEnabled(false);


                roundcount++;

                checkforwin();
                if(roundcount==9)
                    draw();
            }});

        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {


                if(player1turn){
                    seven.setText("X");
                }
                else{
                    seven.setText("O");
                    seven.setTextColor(R.color.colorPrimaryDark);
                }
                if(!seven.getText().toString().equals(""))
                    seven.setEnabled(false);



                roundcount++;
                checkforwin();
                if(roundcount==9)
                    draw();
            }});

        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if(player1turn){
                    eight.setText("X");
                }
                else{
                    eight.setText("O");
                    eight.setTextColor(R.color.colorPrimaryDark);
                }
                if(!eight.getText().toString().equals(""))
                    eight.setEnabled(false);


                roundcount++;
                checkforwin();
                if(roundcount==9)
                    draw();
            }});


    }

                private void player1wins(){

                        player1points++;
                    player1.setText("PLAYER1:"+player1points);
                    Toast.makeText(this,"PLAYER1WINS!",LENGTH_SHORT).show();
                        update();

                    }
                private void player2wins(){

                    player2points++;
                    player2.setText("PLAYER2:"+player2points);


                    Toast.makeText(this,"PLAYER2WINS!", LENGTH_SHORT).show();
                    update();
                    }
                    private void draw(){


                            Toast.makeText(this,"DRAW!",LENGTH_SHORT).show();
                            update();
                    }
    private boolean checkforwin() {
        String[][] field = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = buttons[i][j].getText().toString();
            }
        }
        for (int i = 0; i < 3; i++) {
            if (field[i][0].equals(field[i][1])
                    && field[i][0].equals(field[i][2])
                    && !field[i][0].equals("")) {
                        if(player1turn)
                            player1wins();
                        else if(!player1turn)
                            player2wins();
                        else if(roundcount==9)
                            draw();
                        return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (field[0][i].equals(field[1][i])
                    && field[0][i].equals(field[2][i])
                    && !field[0][i].equals("")) {
                if(player1turn)
                    player1wins();
                else if(!player1turn)
                    player2wins();
                else if (roundcount==9)
                    draw();

                return true;
            }
        }
        if (field[0][0].equals(field[1][1])
                && field[0][0].equals(field[2][2])
                && !field[0][0].equals("")) {
            if(player1turn)
                player1wins();
            else if(!player1turn)
                player2wins();
            else if(roundcount==9)
                draw();

            return true;
        }
        if (field[0][2].equals(field[1][1])
                && field[0][2].equals(field[2][0])
                && !field[0][2].equals("")) {
            if(player1turn)
                player1wins();
            else if(!player1turn)
                player2wins();
            else if(roundcount==9)
                draw();

            return true;
        }
        else{
            player1turn=!player1turn;
            return true;
        }


    }





    private void update(){
                 zero.setText(null);
                 one.setText(null);
                 two.setText(null);
                 three.setText(null);
                 four.setText(null);
                 five.setText(null);
                 six.setText(null);
                 seven.setText(null);
                 eight.setText(null);
                 roundcount=0;
                 zero.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
                 player1turn=true;
             }
            private void reset(){
                buttons[0][0].setText(null);
                buttons[0][1].setText(null);
                buttons[0][2].setText(null);
                buttons[1][0].setText(null);
                buttons[1][1].setText(null);
                buttons[2][2].setText(null);
                buttons[2][1].setText(null);
                buttons[1][2].setText(null);
                buttons[2][0].setText(null);
                player1turn=true;
                roundcount=0;
                player1.setText("PLAYER1:0");
                player2.setText("PLAYER2:0");
                zero.setEnabled(true);
                one.setEnabled(true);
                two.setEnabled(true);
                three.setEnabled(true);
                four.setEnabled(true);
                five.setEnabled(true);
                six.setEnabled(true);
                seven.setEnabled(true);
                eight.setEnabled(true);
                player2points=0;
                player1points=0;
            }



}



