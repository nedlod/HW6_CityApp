package com.example.asus.hw6_cityapp;

import java.util.ArrayList;

public class FillCityArrayList {

    private static City city;
    private static ArrayList<City> cities = new ArrayList<>();
    private static ArrayList<String> cityURL = new ArrayList<>();
    private static ArrayList<String> cityName = new ArrayList<>();
    private static ArrayList<String> cityInfo = new ArrayList<>();

    private static final String Vidin_URL = "http://www.vidin-online.com/images/news/big/vidin-2.jpg";
    private static final String Montana_URL= "https://m.netinfo.bg/media/images/30705/30705817/640-420-montana-dnes-praznuva.jpg";
    private static final String Lom_URL = "http://oalom.acstre.com/assets/BANERI/2017/20171004_ANK_KARTA/Lom_20171004.jpg";
    private static final String Vratsa_URL = "https://bulmar.com/web/files/offices/14/city_gallery/thumb_840x473_vratsa.jpg";
    private static final String Mezdra_URL = "http://kmeta.bg/wp-content/uploads/2016/05/06/5e1a64c4-3656-fb95.jpg";
    private static final String Koynare_URL = "http://koynare.com/summer.jpg";
    private static final String ByalaSlatina_URL = "http://radio-elto.com/wp-content/uploads/2015/09/21.jpg";
    private static final String Kneza_URL = "http://www.kmeta.bg/uploads/image/file/193997/1024821_651_367.jpg";
    private static final String ChervenBryag_URL = "https://m.netinfo.bg/media/images/29381/29381251/640-420-danail-vylov-e-noviiat-kmet-na-cherven-briag.jpg";
    private static final String Mramoren_URL = "https://www.visit.bg/images/upload/uploads/story/1261853375/4b365f1890b43.jpg";

    private static final String Vidin_Name = "Видин";
    private static final String Montana_Name = "Монтана";
    private static final String Lom_Name = "Лом";
    private static final String Vratsa_Name = "Враца";
    private static final String Mezdra_Name = "Мездра";
    private static final String Koynare_Name = "Койнаре";
    private static final String ByalaSlatina_Name = "Бяла Слатина";
    private static final String Kneza_Name = "Кнежа";
    private static final String ChervenBryag_Name = "Червен Бряг";
    private static final String Mramoren_Name = "Село Мраморен";

    private  static final String Vidin_Info = "Вѝдин е областен и общински град в Северозападна България, разположен по поречието на река Дунав. Той е административен и стопански център на едноименните община Видин и област Видин. НСИ определя населението на града на 43 595 жители към 2015 г.";
    private  static final String Montana_Info = "Монта̀на е областен град, разположен в Северозападна България, административен и стопански център на едноименните общини Монтана и област Монтана.";
    private  static final String Lom_Info = "Лом е град в област Монтана, Северозападна България. Разположен е по поречието на река Дунав, при вливането в нея на река Лом";
    private  static final String Vratsa_Info = "Враца е най-големият град в Северозападна България с население към 2015 г. 54 150 души. Административен и стопански център на едноименните община Враца и област Враца. ";
    private  static final String Mezdra_Info = "Мездра е град в област Враца, Северозападна България. Той е административен и стопански център на едноименната община Мездра. Името на града произлиза от турската дума „мездрея“, която в превод означава „запустяло населено място“";
    private  static final String Koynare_Info = "Койна̀ре е град в Северна България. Той се намира в област Плевен и е в близост до град Червен бряг – 15 km и на 52 km от Плевен. Един от 14-те града в Плевенска област, с население между 3 и 5 хиляди души. Втори по големина в община Червен бряг";
    private  static final String ByalaSlatina_Info = "Бя̀ла Сла̀тина е град в област Враца, Северозападна България. Той е административен и стопански център на община Бяла Слатина. Населението на града към края на 2016 година е 10 200 жители";
    private  static final String Kneza_Info = "Кнежа̀ е град в област Плевен, Централна Северна България. Той е административен и стопански център на едноименната община Кнежа. Населението на града към 2009 година е 11 191 жители. Кнежа получава статут на град през 1943 г.";
    private  static final String ChervenBryag_Info = "Червѐн бря̀г е град в Северна България, административен център на община Червен бряг, област Плевен. Населението му е около 13 818 души.";
    private  static final String Mramoren_Info = "Мра̀морен е село в Северозападна България. То се намира в община Враца, област Враца.\n" +
            "\n Село Мраморен граничи със селата Голямо Пещене,Баница и Чирен. Село Мраморен е известно с местноста Милин камък през която е преминал Христо Ботев с неговата чета на път към Врачанския балкан. ";

    private static void fillList(){

        cityURL.add(Vidin_URL);
        cityURL.add(Montana_URL);
        cityURL.add(Lom_URL);
        cityURL.add(Vratsa_URL);
        cityURL.add(Mezdra_URL);
        cityURL.add(Koynare_URL);
        cityURL.add(ByalaSlatina_URL);
        cityURL.add(Kneza_URL);
        cityURL.add(ChervenBryag_URL);
        cityURL.add(Mramoren_URL);

        cityName.add(Vidin_Name);
        cityName.add(Montana_Name);
        cityName.add(Lom_Name);
        cityName.add(Vratsa_Name);
        cityName.add(Mezdra_Name);
        cityName.add(Koynare_Name);
        cityName.add(ByalaSlatina_Name);
        cityName.add(Kneza_Name);
        cityName.add(ChervenBryag_Name);
        cityName.add(Mramoren_Name);

        cityInfo.add(Vidin_Info);
        cityInfo.add(Montana_Info);
        cityInfo.add(Lom_Info);
        cityInfo.add(Vratsa_Info);
        cityInfo.add(Mezdra_Info);
        cityInfo.add(Koynare_Info);
        cityInfo.add(ByalaSlatina_Info);
        cityInfo.add(Kneza_Info);
        cityInfo.add(ChervenBryag_Info);
        cityInfo.add(Mramoren_Info);
    }

    private static void fillCityList(){
        for (int i = 0; i < 10; i++) {
            String citiesURL = cityURL.get(i);
            String citesName = cityName.get(i);
            String citiesInfo = cityInfo.get(i);

            city = new City(citiesURL, citesName,citiesInfo);
            cities.add(city);


        }
    }
    public static void getFillList() {
        fillList();
    }

    public static void getFillCityList() {
        fillCityList();
    }

    public static ArrayList<City> getCities() {
        return cities;
    }


}
