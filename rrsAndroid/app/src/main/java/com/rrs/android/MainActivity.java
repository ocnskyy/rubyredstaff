package com.rrs.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainActivity extends Activity implements CordovaInterface{

    private CordovaWebView cordovaWebView;
    private final ExecutorService threadPool = Executors.newCachedThreadPool();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        cordovaWebView = (CordovaWebView) findViewById(R.id.cordovaWebView);
        cordovaWebView.getSettings().setJavaScriptEnabled(true);
        //cordovaWebView.init();
        cordovaWebView.loadUrl("http://rubyredstaff.com");
        //Config.init();
        //cordovaWebView.loadUrl(Config.getStartUrl());
    }

    @Override
    public void startActivityForResult(CordovaPlugin cordovaPlugin, Intent intent, int i) {

    }

    @Override
    public void setActivityResultCallback(CordovaPlugin cordovaPlugin) {

    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public Object onMessage(String s, Object o) {
        return null;
    }

    @Override
    public ExecutorService getThreadPool() {
        return threadPool;
    }

    @Deprecated
    public Context getContext() { return this; }

}
