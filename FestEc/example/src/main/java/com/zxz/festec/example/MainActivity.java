package com.zxz.festec.example;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.zxz.festec.latte.activities.ProxyActivity;
import com.zxz.festec.latte.delegates.LatteDelegate;

public class MainActivity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
      return new ExampleDelegate();
    }

}
