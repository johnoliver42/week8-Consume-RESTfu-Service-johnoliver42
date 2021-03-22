package main;


import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.util.Properties;

@Log4j2
public class Driver  {

    public static Properties properties = new Properties();

    public static void main(String[] args) {

        Driver driver = new Driver();

        driver.run();

    }

    public void run() {


        try {
            properties.load(this.getClass().getResourceAsStream("/properties.properties"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }




    }


}
