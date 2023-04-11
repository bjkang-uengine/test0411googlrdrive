package testgdrive.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import testgdrive.DriveApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DriveApplication.class })
public class CucumberSpingConfiguration {}
