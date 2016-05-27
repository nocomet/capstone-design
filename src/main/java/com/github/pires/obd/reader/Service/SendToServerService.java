package com.github.pires.obd.reader.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SendToServerService extends Service {

    public SendToServerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}

