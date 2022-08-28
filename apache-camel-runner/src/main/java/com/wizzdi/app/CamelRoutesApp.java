package com.wizzdi.app;

import com.wizzdi.flexicore.boot.base.annotations.plugins.EnableFlexiCorePlugins;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;
import com.wizzdi.flexicore.boot.base.init.FlexiCoreApplication;
import java.io.IOException;

@SpringBootApplication(scanBasePackageClasses = {CamelRoutesApp.class})
@EnableFlexiCorePlugins
public class CamelRoutesApp {


	public static void main(String[] args) throws IOException {
		FlexiCoreApplication app = new FlexiCoreApplication(CamelRoutesApp.class);


		app.addListeners(new ApplicationPidFileWriter());
		ConfigurableApplicationContext context=app.run(args);

	}



}
