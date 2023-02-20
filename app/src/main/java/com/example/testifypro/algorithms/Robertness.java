package com.example.testifypro.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testifypro.R;

public class Robertness extends AppCompatActivity {

    Button Solution;
    EditText lowerValue1,lowerValue2,lowerValue3,upperValue1,upperValue2,upperValue3,v_title1,v_title2,v_title3;

    TextView variables1,variables2,variables3,finalanswer,answer1,answer2,answer3,answer4,Answercontent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robertness);

        getSupportActionBar().setTitle("Robertness Testing");


        v_title1=findViewById(R.id.title_1);
        v_title2=findViewById(R.id.title_2);
        v_title3=findViewById(R.id.title_3);

        lowerValue1=findViewById(R.id.lowervalue1);
        upperValue1=findViewById(R.id.uppervalue1);
        variables1=findViewById(R.id.variables_1);

        lowerValue2=findViewById(R.id.lowervalue2);
        upperValue2=findViewById(R.id.uppervalue2);
        variables2=findViewById(R.id.variables_2);


        lowerValue3=findViewById(R.id.lowervalue3);
        upperValue3=findViewById(R.id.uppervalue3);
        variables3=findViewById(R.id.variables_3);

        Answercontent= findViewById(R.id.answercontent);

        answer1=findViewById(R.id.v1);
        answer2=findViewById(R.id.v2);
        answer3=findViewById(R.id.v3);
        answer4=findViewById(R.id.v4);

        lowerValue1.setText("1");
        lowerValue2.setText("1");
        lowerValue3.setText("1900");
        upperValue1.setText("12");
        upperValue2.setText("30");
        upperValue3.setText("2000");


        Solution=findViewById(R.id.solution);
        //  finalanswer= findViewById(R.id.finalanswer);


        // finalanswer.setBackgroundColor(Color.BLACK);







        Solution.setOnClickListener(

                new View.OnClickListener() {
                    public void onClick(View v) {
//                        String testingtext1 = lowerValue1.getText().toString();
//                        String testingtext2 = lowerValue2.getText().toString();
//                        String testingtext3 = lowerValue3.getText().toString();
//                        String testingtext4 = upperValue1.getText().toString();
//                        String testingtext5 = upperValue2.getText().toString();
//                        String testingtext6 = upperValue3.getText().toString();

                        if(


                                TextUtils.isEmpty(lowerValue1.getText().toString())||
                                        TextUtils.isEmpty(lowerValue2.getText().toString())||

                                        TextUtils.isEmpty(upperValue1.getText().toString())||
                                        TextUtils.isEmpty(upperValue2.getText().toString())


                        ){
                            Toast.makeText(getApplicationContext(),"Some Values are Empty...",Toast.LENGTH_SHORT).show();
                        }

                        else {
                            if (
                                    !TextUtils.isEmpty(lowerValue1.getText().toString())||
                                            !TextUtils.isEmpty(lowerValue2.getText().toString())||
                                            !TextUtils.isEmpty(upperValue1.getText().toString())||
                                            !TextUtils.isEmpty(upperValue2.getText().toString()))
                            {

                                if (
                                        TextUtils.isEmpty(upperValue3.getText().toString())||
                                                TextUtils.isEmpty(lowerValue3.getText().toString())
                                )
                                {

                                    variables3.setText("( a,b,c,d,e,f,g )");

                                    Answercontent.setText("");
                                    Answercontent.setText(Answercontent.getText().toString() + "No, of Combinations = 6 ( n ) + 1\n[ n = 2 ]\nNo, of Combinations = 6 ( 2 ) + 1\nNo, of Combinations = 12 + 1\nNo. of Combinations = 13\n");
                                    //     Answercontent.setText(Answercontent.getText().toString() + "Variables = 2\nTotal Combination = 9\n");

                                    int a1 = Integer.parseInt(lowerValue1.getText().toString());
                                    int f1 = Integer.parseInt(lowerValue1.getText().toString()) - 1;
                                    int b1 = Integer.parseInt(lowerValue1.getText().toString()) + 1;
                                    int c1 = ((Integer.parseInt(lowerValue1.getText().toString()) + Integer.parseInt(upperValue1.getText().toString())) / 2);
                                    int d1 = Integer.parseInt(upperValue1.getText().toString()) - 1;
                                    int g1 = Integer.parseInt(upperValue1.getText().toString()) + 1;
                                    int e1 = Integer.parseInt(upperValue1.getText().toString());
                                    variables1.setText("( " + a1 + "," + f1 + "," + b1 + "," + c1 + "," + d1 + "," + g1 + "," + e1 + " )");

                                    int a2 = Integer.parseInt(lowerValue2.getText().toString());
                                    int f2 = Integer.parseInt(lowerValue2.getText().toString()) - 1;
                                    int b2 = Integer.parseInt(lowerValue2.getText().toString()) + 1;
                                    int c2 = ((Integer.parseInt(lowerValue2.getText().toString()) + Integer.parseInt(upperValue2.getText().toString())) / 2);
                                    int d2 = Integer.parseInt(upperValue2.getText().toString()) - 1;
                                    int g2 = Integer.parseInt(upperValue2.getText().toString()) + 1;
                                    int e2 = Integer.parseInt(upperValue2.getText().toString());
                                    variables2.setText("( " + a2 + "," + f2 + "," + b2 + "," + c2 + "," + d2 + "," + g2 + "," + e2 + " )");

                                    int FirstVariableValues[] ={a1,f1,b1,c1,d1,g1,e1};
                                    int SecondVariableValues[] ={a2,f2,b2,c2,d2,g2,e2};

                                    int Centres[]={c1,c2};

                                    // finalanswer.setText("");
                                    //  finalanswer.setText(finalanswer.getText().toString() +"\nNo#\t|\tVariable 01\t|\tVariable 02");
                                    answer1.setText("No");
                                    answer2.setText(v_title1.getText().toString());
                                    answer3.setText(v_title2.getText().toString());
                                    answer4.setText(v_title3.getText().toString());

                                    answer1.setText(answer1.getText().toString()+"\n---");
                                    answer2.setText(answer2.getText().toString()+"\n----------");
                                    answer3.setText(answer3.getText().toString()+"\n----------");
                                    answer4.setText(answer4.getText().toString()+"\n----------");
                                    int count=1;

                                    for (int i = 0; i < 2; i++) {
                                        for (int j = 0; j < 7; j++) {

                                            if(i==0) {
                                                answer1.setText(answer1.getText().toString()+"\n"+ count+".");
                                                answer2.setText(answer2.getText().toString()+"\n"+Centres[i]);
                                                answer3.setText(answer3.getText().toString()+"\n"+SecondVariableValues[j]);
                                                answer4.setText(answer4.getText().toString()+"\n"+"-");

                                                //   finalanswer.setText(finalanswer.getText().toString() + "\n" + (i + 1) * (j + 1) + ".\t\t\t\t" + Centres[i] + "\t|\t" + FirstVariableValues[j]);
                                                count++;
                                            }
                                            else{
                                                if(FirstVariableValues[j]==Centres[i-1]){
//count++;
                                                }
                                                else {
                                                    answer1.setText(answer1.getText().toString() + "\n" + count + ".");
                                                    answer2.setText(answer2.getText().toString() + "\n" + FirstVariableValues[j]);
                                                    answer3.setText(answer3.getText().toString() + "\n" + Centres[i]);
                                                    answer4.setText(answer4.getText().toString()+"\n"+"-");
                                                    count++;
                                                }
                                            }
                                        }
                                    }
                                } else {





                                    Answercontent.setText("");
                                    Answercontent.setText(Answercontent.getText().toString() + "No, of Combinations = 6 ( n ) + 1\n[ n = 3 ]\nNo, of Combinations = 6 ( 3 ) + 1\nNo, of Combinations = 18 + 1\nNo, of Combinations = 19");
                                    //     Answercontent.setText(Answercontent.getText().toString() + "Variables = 2\nTotal Combination = 9\n");

                                    int a1 = Integer.parseInt(lowerValue1.getText().toString());
                                    int f1 = Integer.parseInt(lowerValue1.getText().toString()) - 1;
                                    int b1 = Integer.parseInt(lowerValue1.getText().toString()) + 1;
                                    int c1 = ((Integer.parseInt(lowerValue1.getText().toString()) + Integer.parseInt(upperValue1.getText().toString())) / 2);
                                    int d1 = Integer.parseInt(upperValue1.getText().toString()) - 1;
                                    int g1 = Integer.parseInt(upperValue1.getText().toString()) + 1;
                                    int e1 = Integer.parseInt(upperValue1.getText().toString());
                                    variables1.setText("( " + a1 + "," + f1 + "," + b1 + "," + c1 + "," + d1 + "," + g1 + "," + e1 + " )");

                                    int a2 = Integer.parseInt(lowerValue2.getText().toString());
                                    int f2 = Integer.parseInt(lowerValue2.getText().toString()) - 1;
                                    int b2 = Integer.parseInt(lowerValue2.getText().toString()) + 1;
                                    int c2 = ((Integer.parseInt(lowerValue2.getText().toString()) + Integer.parseInt(upperValue2.getText().toString())) / 2);
                                    int d2 = Integer.parseInt(upperValue2.getText().toString()) - 1;
                                    int g2 = Integer.parseInt(upperValue2.getText().toString()) + 1;
                                    int e2 = Integer.parseInt(upperValue2.getText().toString());
                                    variables2.setText("( " + a2 + "," + f2 + "," + b2 + "," + c2 + "," + d2 + "," + g2 + "," + e2 + " )");


                                    int a3 = Integer.parseInt(lowerValue3.getText().toString());
                                    int f3 = Integer.parseInt(lowerValue3.getText().toString()) - 1;
                                    int b3 = Integer.parseInt(lowerValue3.getText().toString()) + 1;
                                    int c3 = ((Integer.parseInt(lowerValue3.getText().toString()) + Integer.parseInt(upperValue3.getText().toString())) / 2);
                                    int d3 = Integer.parseInt(upperValue3.getText().toString()) - 1;
                                    int g3 = Integer.parseInt(upperValue3.getText().toString()) + 1;
                                    int e3 = Integer.parseInt(upperValue3.getText().toString());
                                    variables3.setText("( " + a3 + "," + f3 + "," + b3 + "," + c3 + "," + d3 + "," + g3 + "," + e3 + " )");



                                    int FirstVariableValues[] ={a1,f1,b1,c1,d1,g1,e1};
                                    int SecondVariableValues[] ={a2,f2,b2,c2,d2,g2,e2};
                                    int ThirdVariableValues[] ={a3,f3,b3,c3,d3,g3,e3};

                                    int Centres[]={c1,c2,c3};

                                    // finalanswer.setText("");
                                    //   finalanswer.setText(finalanswer.getText().toString() +"\nNo#\t|\tVariable 01\t|\tVariable 02");
                                    answer1.setText("No");
                                    answer2.setText(v_title1.getText().toString());
                                    answer3.setText(v_title2.getText().toString());
                                    answer4.setText(v_title3.getText().toString());

                                    answer1.setText(answer1.getText().toString()+"\n---");
                                    answer2.setText(answer2.getText().toString()+"\n----------");
                                    answer3.setText(answer3.getText().toString()+"\n----------");
                                    answer4.setText(answer4.getText().toString()+"\n----------");
                                    int count=1;

                                    for (int i = 0; i < 3; i++) {
                                        for (int j = 0; j < 7; j++) {

                                            if(i==0) {
                                                answer1.setText(answer1.getText().toString()+"\n"+ count+".");
                                                answer2.setText(answer2.getText().toString()+"\n"+Centres[i]);
                                                answer3.setText(answer3.getText().toString()+"\n"+SecondVariableValues[j]);
                                                answer4.setText(answer4.getText().toString()+"\n"+ThirdVariableValues[j]);


                                                //   finalanswer.setText(finalanswer.getText().toString() + "\n" + (i + 1) * (j + 1) + ".\t\t\t\t" + Centres[i] + "\t|\t" + FirstVariableValues[j]);
                                                count++;
                                            }
                                            else if (i==1){
                                                if(FirstVariableValues[j]==Centres[i-1]||ThirdVariableValues[j]==Centres[i-1]){
//count++;
                                                }
                                                else {
                                                    answer1.setText(answer1.getText().toString() + "\n" + count + ".");
                                                    answer2.setText(answer2.getText().toString() + "\n" + FirstVariableValues[j]);
                                                    answer3.setText(answer3.getText().toString() + "\n" + Centres[i]);
                                                    answer4.setText(answer4.getText().toString()+"\n"+ThirdVariableValues[j]);
                                                    count++;
                                                    //     finalanswer.setText(finalanswer.getText().toString() + "\n" + (i + 1) * (j + 1) + ".\t\t\t\t" + SecondVariableValues[j] + "\t|\t" + Centres[i]);
                                                }
                                            }

                                            else{

                                                if(FirstVariableValues[j]==Centres[i-2]||SecondVariableValues[j]==Centres[i-2]){
//count++;
                                                }
                                                else {
                                                    answer1.setText(answer1.getText().toString() + "\n" + count + ".");
                                                    answer2.setText(answer2.getText().toString() + "\n" + FirstVariableValues[j]);
                                                    answer3.setText(answer3.getText().toString() + "\n" + SecondVariableValues[j]);
                                                    answer4.setText(answer4.getText().toString()+"\n"+Centres[i]);
                                                    count++;
                                                    //    finalanswer.setText(finalanswer.getText().toString() + "\n" + (i + 1) * (j + 1) + ".\t\t\t\t" + SecondVariableValues[j] + "\t|\t" + Centres[i]);
                                                }

                                            }
                                        }
                                    }
                                }

                            }

                            else if (!lowerValue1.equals("") && !upperValue1.equals("") && !lowerValue2.equals("") && !upperValue2.equals("") && !lowerValue3.equals("") && !upperValue3.equals("")) {
                                //   finalanswer.setText(finalanswer.getText().toString() + "This is Combination of 3");
                            } else {

                                //  finalanswer.setText(finalanswer.getText().toString() + "No Valid Value");
                            }

                        }

                    }}
        );

    }
}