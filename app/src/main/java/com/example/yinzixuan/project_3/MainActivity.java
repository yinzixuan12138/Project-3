package com.example.yinzixuan.project_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int a=0;
   int b=0;
    int Major1=0;
    int Major2=0;
    int Major3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Sex_Is_Null=(TextView)findViewById(R.id.Sex_Is_Null);
        final TextView Numbuer_Is_Null=(TextView)findViewById(R.id.Number_Is_Null);
        final TextView Major_Is_Null=(TextView)findViewById(R.id.Major_Is_Null);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        final EditText editText=(EditText)findViewById(R.id.editText);


        //获得布局文件中的RadioButton控件
        final RadioButton Man=(RadioButton)findViewById(R.id.Man);
        final RadioButton Woman=(RadioButton)findViewById(R.id.Woman);


        //获得布局文件中的CheckBox控件
        final CheckBox Major_a=(CheckBox)findViewById(R.id.Major_a);
        final CheckBox Major_b=(CheckBox)findViewById(R.id.Major_b);
        final CheckBox Major_c=(CheckBox)findViewById(R.id.Major_c);

        Button Finish=(Button)findViewById(R.id.Finish);
        Button Clear=(Button)findViewById(R.id.Clear);

        Man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=1;
                try
                {String Str=editText.getText().toString();
                    b=Integer.parseInt(Str);
                    Numbuer_Is_Null.setText("输入成功！！！");}
                catch (Exception e){
                    Numbuer_Is_Null.setText("学号不能为空！！！");
                }
            }
        });

        Woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=1;
                try
                {String Str=editText.getText().toString();
                    b=Integer.parseInt(Str);
                    Numbuer_Is_Null.setText("输入成功！！！");}
                catch (Exception e){
                    Numbuer_Is_Null.setText("学号不能为空！！！");
                }
            }
        });

        Major_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Major1=1;
                try
                {String Str=editText.getText().toString();
                    b=Integer.parseInt(Str);
                    Numbuer_Is_Null.setText("输入成功！！！");}
                catch (Exception e){
                    Numbuer_Is_Null.setText("学号不能为空！！！");
                }
                if(a==1){
                    Sex_Is_Null.setText("输入成功！！！");
                }
                else
                    Sex_Is_Null.setText("性别不能为空！！！");
            }
        });

        Major_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Major2=1;
                try
                {String Str=editText.getText().toString();
                    b=Integer.parseInt(Str);
                    Numbuer_Is_Null.setText("输入成功！！！");}
                catch (Exception e){
                    Numbuer_Is_Null.setText("学号不能为空！！！");
                }
                if(a==1){
                    Sex_Is_Null.setText("输入成功！！！");
                }
                else
                    Sex_Is_Null.setText("性别不能为空！！！");
            }
        });

        Major_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Major3=1;
                try
                {String Str=editText.getText().toString();
                    b=Integer.parseInt(Str);
                    Numbuer_Is_Null.setText("输入成功！！！");}
                catch (Exception e){
                    Numbuer_Is_Null.setText("学号不能为空！！！");
                }
                if(a==1){
                    Sex_Is_Null.setText("输入成功！！！");
                }
                else
                    Sex_Is_Null.setText("性别不能为空！！！");
            }
        });

        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {String Str=editText.getText().toString();
                    b=Integer.parseInt(Str);
                    Numbuer_Is_Null.setText("输入成功！！！");
                    if(a==1){
                        Sex_Is_Null.setText("输入成功！！！");
                    }
                    else
                        Sex_Is_Null.setText("性别不能为空！！！");
                    if(Major1==0&&Major2==0&Major3==0)
                        Major_Is_Null.setText("课程不能为空！！！");
                    else
                    { Major_Is_Null.setText("输入成功！！！");
                        if(a==1)
                        textView2.setText("填写正确");}

                }
                catch (Exception e){
                    Numbuer_Is_Null.setText("学号不能为空！！！");
                }
                if(a==1){
                    Sex_Is_Null.setText("输入成功！！！");
                }
                else
                    Sex_Is_Null.setText("性别不能为空！！！");
                if(Major1==0&&Major2==0&Major3==0)
                    Major_Is_Null.setText("课程不能为空！！！");
                else                     Major_Is_Null.setText("输入成功！！！");

        }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                Major_a.setChecked(false);
                Major_b.setChecked(false);
                Major_c.setChecked(false);
                Man.setChecked(false);
                Woman.setChecked(false);
                Sex_Is_Null.setText("");
                Numbuer_Is_Null.setText("");
                Major_Is_Null.setText("");
                a=0;
                b=0;
                 Major1=0;
                 Major2=0;
                 Major3=0;
                textView2.setText("");
            }
        });

    }

    }

