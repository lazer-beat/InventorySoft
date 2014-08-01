package ru.aincorp.invesoft.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.util.Callback;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aincorp.invesoft.config.AppConfig;
import ru.aincorp.invesoft.controller.Controller;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Алмаз on 31.07.14.
 */
public class SpringFXMLLoader {

    private static Logger LOG = Logger.getLogger(SpringFXMLLoader.class);
    private static final ApplicationContext APPLICATION_CONTEXT = new AnnotationConfigApplicationContext(AppConfig.class);

    public static Controller load(String url) {
        InputStream fxmlStream = null;
        try {
            fxmlStream = SpringFXMLLoader.class.getResourceAsStream(url);
            FXMLLoader loader = new FXMLLoader();
            loader.setControllerFactory(new Callback<Class<?>, Object>() {
                @Override
                public Object call(Class<?> aClass) {
                    return APPLICATION_CONTEXT.getBean(aClass);
                }
            });

            Node view = (Node) loader.load(fxmlStream);
            Controller controller = loader.getController();
            controller.setView(view);

            return controller;
        } catch (IOException e) {
            LOG.error("Can't load resource",e);
            throw new RuntimeException(e);
        } finally {
            if (fxmlStream != null) {
                try{
                    fxmlStream.close();

                } catch (IOException e) {
                    LOG.error("Can't close stream", e);
                }
            }
        }
    }


}
