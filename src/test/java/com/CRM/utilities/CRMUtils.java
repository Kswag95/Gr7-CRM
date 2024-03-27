package com.CRM.utilities;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
public class CRMUtils {
    public static String getFakeMessage(String part){
        Faker faker = new Faker();
        String fakeMessage = part + " " + faker.name().firstName() + " " + faker.name().lastName();
        return fakeMessage;
    }

    public static List<String> getElementsAttribute(String attributeName, List<WebElement> moreOptions) {
        List<String> list=new ArrayList<>();

        for (WebElement moreOption : moreOptions) {
            list.add(moreOption.getAttribute(attributeName));

        }
        return list;
    }


    public static String getFakeDepartmentName(String depart){
        Faker faker = new Faker();
        return depart + " " + faker.name().firstName() + " " + faker.name().lastName();

    }


}
