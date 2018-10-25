package com.example.lalthanpuia.neida3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.widget.Toast;

public class WhatsApp {

    Context context;


    public WhatsApp(ZikhlumNew zikhlumNew){
        context= zikhlumNew;
    }

    public WhatsApp(Main2Activity main2Activity){
        context= main2Activity;
    }
    public WhatsApp(Main3Activity_hnahkir main3Activity_hnahkir){
        context= main3Activity_hnahkir;
    }
    public WhatsApp(Main4Activity_aHnahRau main4Activity_aHnahRau){
        context= main4Activity_aHnahRau;
    }
    public WhatsApp(Main5Activity_rahNatna main5Activity_rahNatna){
        context= main5Activity_rahNatna;
    }
    public WhatsApp(Main6Activity_bawmtuVar main6Activity_bawmtuVar){
        context= main6Activity_bawmtuVar;
    }
    public WhatsApp(Main7Activity_thlawkVar main7Activity_thlawkVar){
        context= main7Activity_thlawkVar;
    }
    public WhatsApp(Main8Activity_khau main8Activity_khau){
        context= main8Activity_khau;
    }
    public WhatsApp(Main9Activity_Hnah_tui_hnang_dawt_tu main9Activity_hnah_tui_hnang_dawt_tu){
        context= main9Activity_hnah_tui_hnang_dawt_tu;
    }

    public WhatsApp(Main10Activity_zikhlum_hnahTawih main10Activity_zikhlum_hnahTawih){
        context= main10Activity_zikhlum_hnahTawih;
    }

    public WhatsApp(Main11Activity_zikhlum_hnahRau main11Activity_zikhlum_hnahRau){
        context = main11Activity_zikhlum_hnahRau;
    }

    public WhatsApp(Main12Activity_zikhlum__tiak_lawng main12Activity_zikhlum__tiak_lawng){
        context = main12Activity_zikhlum__tiak_lawng;
    }

    public WhatsApp(Main13Activity_zikhum_hnah_hnuailam_var main13Activity_zikhum_hnah_hnuailam_var){
        context = main13Activity_zikhum_hnah_hnuailam_var;
    }


    public WhatsApp(Main14Activity_zikhlum_hri main14Activity_zikhlum_hri){
        context = main14Activity_zikhlum_hri;
    }


    public WhatsApp(Main15Activity_zikhlum_pangangte main15Activity_zikhlum_pangangte){
        context = main15Activity_zikhlum_pangangte;
    }


    public WhatsApp(Main16Activity_zikhlum_hnah_char_khawmtu main16Activity_zikhlum_hnah_char_khawmtu){
        context = main16Activity_zikhlum_hnah_char_khawmtu;
    }


    public WhatsApp(Main17Activity_zikhlum_tiak_sehchhumtu main17Activity_zikhlum_tiak_sehchhumtu){
        context = main17Activity_zikhlum_tiak_sehchhumtu;
    }

    public WhatsApp(Main18Activity_zikhlum_pangang_hring main18Activity_zikhlum_pangang_hring){
        context = main18Activity_zikhlum_pangang_hring;
    }

    public WhatsApp(Main31Activity_balhla_tam_hri main31Activity_balhla_tam_hri){
        context = main31Activity_balhla_tam_hri;
    }

    public WhatsApp(Main32Activity_balhla_than_thut main32Activity_balhla_than_thut){
        context = main32Activity_balhla_than_thut;
    }

    public WhatsApp(Main33Activity_hnah_de_eng main33Activity_hnah_de_eng ){
        context = main33Activity_hnah_de_eng;
    }
    public WhatsApp(Main34Activity_hnah_leh_rah_rau main34Activity_hnah_leh_rah_rau ){
        context = main34Activity_hnah_leh_rah_rau;
    }
    public WhatsApp(Main35Activity_balhla_thrips main35Activity_balhla_thrips ){
        context = main35Activity_balhla_thrips;
    }
    public WhatsApp( Main36Activity_aphid main36Activity_aphid){
        context = main36Activity_aphid;
    }

    public WhatsApp(Main37Activity_balhla_PSEUDOSTEMBORER main37Activity_balhla_pseudostemborer ){
        context = main37Activity_balhla_pseudostemborer;
    }
    public WhatsApp(Main37Activity_balhla_fruitandLeaf_scarring main37Activity_balhla_fruitandLeaf_scarring ){
        context = main37Activity_balhla_fruitandLeaf_scarring;
    }
    public WhatsApp(Main41Activity_purunsen_kungHmawrTawih main41Activity_purunsen_kungHmawrTawih ){
        context = main41Activity_purunsen_kungHmawrTawih;
    }
    public WhatsApp(Main42Activity_purunsen_ahnahTawih main42Activity_purunsen_ahnahTawih ){
        context = main42Activity_purunsen_ahnahTawih;
    }
    public WhatsApp(Main43Activity_purunsen_hnah_rau main43Activity_purunsen_hnah_rau ){
        context = main43Activity_purunsen_hnah_rau;
    }
    public WhatsApp(Main44Activity_a_hnah_rau_blight main44Activity_a_hnah_rau_blight ){
        context = main44Activity_a_hnah_rau_blight;
    }
    public WhatsApp(Main45Activity_purunsen_aHnahVuai main45Activity_purunsen_aHnahVuai ){
        context = main45Activity_purunsen_aHnahVuai;
    }
    public WhatsApp(Main46Activity_purunsen_hnah_ei_rangtu main46Activity_purunsen_hnah_ei_rangtu ){
        context = main46Activity_purunsen_hnah_ei_rangtu;
    }
    public WhatsApp(Main47Activity_purunsen_hnah_hreuh_rangtu main47Activity_purunsen_hnah_hreuh_rangtu){
        context = main47Activity_purunsen_hnah_hreuh_rangtu;
    }
    public WhatsApp(Main48Activity_purunsen_tiak_sehchhumtu main48Activity_purunsen_tiak_sehchhumtu ){
        context = main48Activity_purunsen_tiak_sehchhumtu;
    }
    public WhatsApp(Main49Activity_purunsen_lung main49Activity_purunsen_lung ){
        context = main49Activity_purunsen_lung;
    }
    public WhatsApp(Main51Activity_serthlum_a_hnah_hnai main51Activity_serthlum_a_hnah_hnai ){
        context = main51Activity_serthlum_a_hnah_hnai;
    }
    public WhatsApp(Main52Activity_serthlum_kumthu main52Activity_serthlum_kumthu ){
        context = main52Activity_serthlum_kumthu;
    }
    public WhatsApp(Main53Activity_serthlum_a_hnah_rau main53Activity_serthlum_a_hnah_rau ){
        context = main53Activity_serthlum_a_hnah_rau ;
    }
    public WhatsApp(Main54Activity_serthlum_vutbuak main54Activity_serthlum_vutbuak ){
        context = main54Activity_serthlum_vutbuak;
    }
    public WhatsApp(Main55Activity_rah_tawih main55Activity_rah_tawih ){
        context = main55Activity_rah_tawih;
    }
    public WhatsApp(Main56Activity_serthlum_katnei main56Activity_serthlum_katnei ){
        context = main56Activity_serthlum_katnei;
    }
    public WhatsApp(Main57Activity_serthlum_citurs_leaf main57Activity_serthlum_citurs_leaf ){
        context = main57Activity_serthlum_citurs_leaf;
    }
    public WhatsApp(Main57Activity_serthlum_kung_kertu main57Activity_serthlum_kung_kertu ){
        context = main57Activity_serthlum_kung_kertu;
    }
    public WhatsApp(Main59Activity_serthlum_rah_dawttu main59Activity_serthlum_rah_dawttu ){
        context = main59Activity_serthlum_rah_dawttu;
    }
    public WhatsApp(Main510Activity_serthlum_moth main510Activity_serthlum_moth ){
        context = main510Activity_serthlum_moth;
    }
    public WhatsApp(Main61Activity_vaimim_KuangTawih main61Activity_vaimim_kuangTawih ){
        context = main61Activity_vaimim_kuangTawih;
    }
    public WhatsApp(Main62Activity_vaimim_a_kuang_meihawl main62Activity_vaimim_a_kuang_meihawl ){
        context = main62Activity_vaimim_a_kuang_meihawl;
    }
    public WhatsApp(Main63Activity_vaimim_hnah_rau main63Activity_vaimim_hnah_rau ){
        context = main63Activity_vaimim_hnah_rau;
    }
    public WhatsApp(Main63Activity_vaimim_Hnah_rau_val main63Activity_vaimim_hnah_rau_val){
        context = main63Activity_vaimim_hnah_rau_val;
    }
    public WhatsApp(Main65Activity_vaimim_kau_eitu main65Activity_vaimim_kau_eitu){
        context = main65Activity_vaimim_kau_eitu;
    }
    public WhatsApp(Main66Activity_vaimim_pangan_hmul main66Activity_vaimim_pangan_hmul ){
        context = main66Activity_vaimim_pangan_hmul;
    }
    public WhatsApp(Main67Activity_vaimim_jassid main67Activity_vaimim_jassid ){
        context = main67Activity_vaimim_jassid;
    }
    public WhatsApp(Main68Activity_vaimim_tuiHnangDawttu main68Activity_vaimim_tuiHnangDawttu ){
        context = main68Activity_vaimim_tuiHnangDawttu;
    }



    public void whatsappSend(){
        try {
//THIS NUMBER BELONGS TO RUATA
        /*    String toNumber ="8974111361";
            Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + "" + toNumber+ "?body=" + ""));
            sendIntent.setPackage("com.whatsapp");
            context.startActivity(sendIntent);*/
            String smsNumber = "8974111361";
            boolean isWhatsappInstalled = whatsappInstalledOrNot("com.whatsapp");
            if (isWhatsappInstalled) {

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber) + "@s.whatsapp.net");//phone number without "+" prefix

                context.startActivity(sendIntent);
            } else {
                Uri uri = Uri.parse("market://details?id=com.whatsapp");
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                //Toast.makeText(, "WhatsApp not Installed", Toast.LENGTH_SHORT).show();
                context.startActivity(goToMarket);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            // Toast.makeText(MainActivity.this,"it may be you dont have whats app",Toast.LENGTH_LONG).show();

        }
    }
    private boolean whatsappInstalledOrNot(String uri) {
        PackageManager pm = context.getPackageManager();
        boolean app_installed = false;
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            app_installed = false;
        }
        return app_installed;
    }
}
