package com.example.samuyu.lolipop.entities;

import java.util.ArrayList;
import java.util.List;

public class StartContainer {



    public static List<Star> getList() {
        List<Star> list = new ArrayList<Star>();

        String imgUrl = "http://blog-imgs-70.fc2.com/n/a/r/narutabi0904/ryuusei.jpg";
        String title = "一生忘れない、サハラ砂漠の星空";
        String description = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        list.add( new Star(imgUrl, title, description));

        imgUrl = "http://userdisk.webry.biglobe.ne.jp/013/627/49/N000/000/000/127911041679616131094.jpg";
        title = "秋の天の川";
        description = "新調したレンズの本番撮影の為に、9月28日の深夜に蔵王山まで遠征して来ました。\n" +
                "夜空の透明度が良く、雲海の上に出る事も出来たので、光害の影響の少ない満天の星空を見る事が出来ました。";
        list.add( new Star(imgUrl, title, description));

        imgUrl = "http://sala-eathetic.com/wp-content/uploads/2013/12/h76_20131203214949d07.jpg";
        title = "クリスマスプレゼント";
        description = "みなさまご自身のクリスマスプレゼントにエステはいかがでしょうか？\n" +
                " \n" +
                "お肌に弱い方専門の美肌に特化したトリートメントをぜひご体験下さい\n" +
                " \n" +
                " \n" +
                "12月中も予約に空きはございますので、お気軽にお問合せください";
        list.add( new Star(imgUrl, title, description));

        imgUrl = "http://tokyoyakei.jp/christmas10/tds-xmas10/tds-xmas10-39l.jpg";
        title = "東京ディズニーシー\n" +
                "　　　　クリスマス夜景";
        description = "クリスマス夜景を紹介";
        list.add( new Star(imgUrl, title, description));

        return list;
    }
}
