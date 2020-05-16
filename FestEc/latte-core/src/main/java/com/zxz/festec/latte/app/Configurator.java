package com.zxz.festec.latte.app;

import android.content.res.Configuration;

import java.util.WeakHashMap;

public class Configurator {
    private  static final WeakHashMap<String,Object>LATTE_CONFIGES=new WeakHashMap<>();
    private Configurator(){
        LATTE_CONFIGES.put(ConfigType.CONFIG_READY.name(),false);
    }
    private static class Holder{
        private static final Configurator INSTANCE = new Configurator();
    }
    public static Configurator getInstance(){
        return Holder.INSTANCE;
    }
    final  WeakHashMap<String,Object> getLatteConfiges()
    {
        return LATTE_CONFIGES;
    }

    public final void configure(){
        LATTE_CONFIGES.put(ConfigType.CONFIG_READY.name(),true);
    }

    public final Configurator withApiHost(String host){
        LATTE_CONFIGES.put(ConfigType.API_HOST.name(),host);
        return this;
    }

    private void checkConfiguration(){
        final  boolean isReady= (boolean) LATTE_CONFIGES.get(ConfigType.CONFIG_READY.name());
        if (!isReady){
            throw new RuntimeException("Configuration 没有准备好，呼叫configure");

        }
    }

    /**
     * @param key
     * @param <T>
     * @return
     */
    final <T> T getConfiguration(Enum<ConfigType> key){
        checkConfiguration();
        return (T) LATTE_CONFIGES.get(key.name());
    }
}
