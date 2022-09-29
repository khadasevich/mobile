package appium;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

public class AppiumService {

    private AppiumDriverLocalService server;
    private AppiumServiceBuilder serviceBuilder;

    public AppiumService() {
        this.serviceBuilder = new AppiumServiceBuilder();
    }

    public AppiumDriverLocalService startService() {
        serviceBuilder.usingPort(4723)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"))
                .withAppiumJS(new File("C:/Users/alexeykhodasevich/AppData/Local/Programs/Appium Server GUI/resources/app/node_modules/appium/build/lib/main.js"))
                .withArgument(() -> "--base-path", "/wd/");
        server = AppiumDriverLocalService.buildService(serviceBuilder);
        server.start();
        return server;
    }

    public void stopService() {
        this.server.stop();
    }
}
