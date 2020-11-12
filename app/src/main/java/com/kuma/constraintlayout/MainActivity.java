package com.kuma.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // アクティビティからレイアウトを生成することもできる
        // レイアウトをコードから生成する際には、
        // ・ビューグループをインスタンス化
        // ・レイアウト属性をはじめ、必要な情報を定義
        // ・addViewメソッドで違いに関連づけ(親子関係を定義)
        // ・setContentViewメソッドで最上位のビュー(グループ)をアクティビティに登録
        // といった手順を踏む

//        // LinearLayoutを準備
//        LinearLayout layout = new LinearLayout(this);
//        // LinearLayoutのレイアウト属性を設定
//        layout.setLayoutParams(new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT));
//        layout.setOrientation(LinearLayout.VERTICAL);
//        layout.setGravity(Gravity.CENTER);
//        // TextViewを準備
//        TextView txt = new TextView(this);
//        // TextViewのレイアウト属性を設定(高さ&幅、中央寄せ)
//        LinearLayout.LayoutParams txtLayout = new LinearLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        // TextViewにレイアウト設定をセット
//        txt.setLayoutParams(txtLayout);
//        // 文字列リソースをTextViewに割り当て
//        txt.setText("Hello World!");
//        layout.addView(txt);
//        // LinearLayoutをアクティビティにセット
//        setContentView(layout);

    }
}